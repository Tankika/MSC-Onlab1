package hu.bme.onlab.post.bean;

import java.util.Map;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

@BeanDefinition
public class CheckAddressResponse implements Bean {

	@PropertyDefinition
	private String city;
	
	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code CheckAddressResponse}.
	 * @return the meta-bean, not null
	 */
	public static CheckAddressResponse.Meta meta() {
		return CheckAddressResponse.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(CheckAddressResponse.Meta.INSTANCE);
	}

	@Override
	public CheckAddressResponse.Meta metaBean() {
		return CheckAddressResponse.Meta.INSTANCE;
	}

	@Override
	public <R> Property<R> property(String propertyName) {
		return metaBean().<R>metaProperty(propertyName).createProperty(this);
	}

	@Override
	public Set<String> propertyNames() {
		return metaBean().metaPropertyMap().keySet();
	}

	//-----------------------------------------------------------------------
	/**
	 * Gets the city.
	 * @return the value of the property
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 * @param city  the new value of the property
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the the {@code city} property.
	 * @return the property, not null
	 */
	public final Property<String> city() {
		return metaBean().city().createProperty(this);
	}

	//-----------------------------------------------------------------------
	@Override
	public CheckAddressResponse clone() {
		return JodaBeanUtils.cloneAlways(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			CheckAddressResponse other = (CheckAddressResponse) obj;
			return JodaBeanUtils.equal(getCity(), other.getCity());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(getCity());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(64);
		buf.append("CheckAddressResponse{");
		int len = buf.length();
		toString(buf);
		if (buf.length() > len) {
			buf.setLength(buf.length() - 2);
		}
		buf.append('}');
		return buf.toString();
	}

	protected void toString(StringBuilder buf) {
		buf.append("city").append('=').append(JodaBeanUtils.toString(getCity())).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code CheckAddressResponse}.
	 */
	public static class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code city} property.
		 */
		private final MetaProperty<String> city = DirectMetaProperty.ofReadWrite(
				this, "city", CheckAddressResponse.class, String.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"city");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 3053931:  // city
					return city;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public BeanBuilder<? extends CheckAddressResponse> builder() {
			return new DirectBeanBuilder<CheckAddressResponse>(new CheckAddressResponse());
		}

		@Override
		public Class<? extends CheckAddressResponse> beanType() {
			return CheckAddressResponse.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		/**
		 * The meta-property for the {@code city} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<String> city() {
			return city;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 3053931:  // city
					return ((CheckAddressResponse) bean).getCity();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 3053931:  // city
					((CheckAddressResponse) bean).setCity((String) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}
