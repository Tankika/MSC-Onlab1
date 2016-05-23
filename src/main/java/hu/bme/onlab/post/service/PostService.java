package hu.bme.onlab.post.service;

import java.util.List;

import hu.bme.onlab.post.bean.PostListData;
import hu.bme.onlab.post.bean.SendPostRequest;

public interface PostService {

	/**
	 * 
	 * @param request
	 */
	void sendPost(SendPostRequest request);
	
	/**
	 * 	
	 * @return
	 */
	List<PostListData> listPosts();
}
