package hu.bme.onlab.post.bean;

import java.util.List;
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
public class GetCategoriesResponse implements Bean {

	@PropertyDefinition
	List<GetCategoriesData> categories;
	
	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code GetCategoriesResponse}.
	 * @return the meta-bean, not null
	 */
	public static GetCategoriesResponse.Meta meta() {
		return GetCategoriesResponse.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(GetCategoriesResponse.Meta.INSTANCE);
	}

	@Override
	public GetCategoriesResponse.Meta metaBean() {
		return GetCategoriesResponse.Meta.INSTANCE;
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
	 * Gets the categories.
	 * @return the value of the property
	 */
	public List<GetCategoriesData> getCategories() {
		return categories;
	}

	/**
	 * Sets the categories.
	 * @param categories  the new value of the property
	 */
	public void setCategories(List<GetCategoriesData> categories) {
		this.categories = categories;
	}

	/**
	 * Gets the the {@code categories} property.
	 * @return the property, not null
	 */
	public final Property<List<GetCategoriesData>> categories() {
		return metaBean().categories().createProperty(this);
	}

	//-----------------------------------------------------------------------
	@Override
	public GetCategoriesResponse clone() {
		return JodaBeanUtils.cloneAlways(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			GetCategoriesResponse other = (GetCategoriesResponse) obj;
			return JodaBeanUtils.equal(getCategories(), other.getCategories());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(getCategories());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(64);
		buf.append("GetCategoriesResponse{");
		int len = buf.length();
		toString(buf);
		if (buf.length() > len) {
			buf.setLength(buf.length() - 2);
		}
		buf.append('}');
		return buf.toString();
	}

	protected void toString(StringBuilder buf) {
		buf.append("categories").append('=').append(JodaBeanUtils.toString(getCategories())).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code GetCategoriesResponse}.
	 */
	public static class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code categories} property.
		 */
		@SuppressWarnings({"unchecked", "rawtypes" })
		private final MetaProperty<List<GetCategoriesData>> categories = DirectMetaProperty.ofReadWrite(
				this, "categories", GetCategoriesResponse.class, (Class) List.class);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"categories");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 1296516636:  // categories
					return categories;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public BeanBuilder<? extends GetCategoriesResponse> builder() {
			return new DirectBeanBuilder<GetCategoriesResponse>(new GetCategoriesResponse());
		}

		@Override
		public Class<? extends GetCategoriesResponse> beanType() {
			return GetCategoriesResponse.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		/**
		 * The meta-property for the {@code categories} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<List<GetCategoriesData>> categories() {
			return categories;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 1296516636:  // categories
					return ((GetCategoriesResponse) bean).getCategories();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@SuppressWarnings("unchecked")
		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 1296516636:  // categories
					((GetCategoriesResponse) bean).setCategories((List<GetCategoriesData>) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}
