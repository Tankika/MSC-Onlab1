angular.module('ServiceFinder.Login')
	.controller('navigationCtrl', ['$rootScope', '$http', '$location', function($rootScope, $http, $location) {
		var self = this;
	
		var authenticate = function(credentials, callback) {
	
			var headers = credentials ?
				{
					authorization : "Basic " + btoa(credentials.username + ":" + credentials.password)
				} :
				{};
	
			$http.get('user', {headers : headers}).then(function(data) {
				if (data.data.name) {
					$rootScope.authenticated = true;
				} else {
					$rootScope.authenticated = false;
				}
				callback();
			}, function() {
				$rootScope.authenticated = false;
				callback();
			});
	
		};
	
		authenticate();
		self.credentials = {};
		self.login = function() {
				authenticate(self.credentials, function() {
					if ($rootScope.authenticated) {
						$location.path("/");
						self.error = false;
					} else {
						$location.path("/login");
						self.error = true;
					}
				});
		};
		
		self.logout = function() {
		$http.post("/logout", {}).then(logoutHandler, logoutHandler);
		
		function logoutHandler(result) {
			$rootScope.authenticated = false;
			$location.path("/"); 
		}
		};
	}]);