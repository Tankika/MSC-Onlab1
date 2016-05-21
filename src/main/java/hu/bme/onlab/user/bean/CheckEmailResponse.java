package hu.bme.onlab.user.bean;

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
public class CheckEmailResponse implements Bean {

	@PropertyDefinition
	private boolean emailFree;

	//------------------------- AUTOGENERATED START -------------------------
	///CLOVER:OFF
	/**
	 * The meta-bean for {@code CheckEmailResponse}.
	 * @return the meta-bean, not null
	 */
	public static CheckEmailResponse.Meta meta() {
		return CheckEmailResponse.Meta.INSTANCE;
	}

	static {
		JodaBeanUtils.registerMetaBean(CheckEmailResponse.Meta.INSTANCE);
	}

	@Override
	public CheckEmailResponse.Meta metaBean() {
		return CheckEmailResponse.Meta.INSTANCE;
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
	 * Gets the emailFree.
	 * @return the value of the property
	 */
	public boolean isEmailFree() {
		return emailFree;
	}

	/**
	 * Sets the emailFree.
	 * @param emailFree  the new value of the property
	 */
	public void setEmailFree(boolean emailFree) {
		this.emailFree = emailFree;
	}

	/**
	 * Gets the the {@code emailFree} property.
	 * @return the property, not null
	 */
	public final Property<Boolean> emailFree() {
		return metaBean().emailFree().createProperty(this);
	}

	//-----------------------------------------------------------------------
	@Override
	public CheckEmailResponse clone() {
		return JodaBeanUtils.cloneAlways(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == this.getClass()) {
			CheckEmailResponse other = (CheckEmailResponse) obj;
			return (isEmailFree() == other.isEmailFree());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = getClass().hashCode();
		hash = hash * 31 + JodaBeanUtils.hashCode(isEmailFree());
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(64);
		buf.append("CheckEmailResponse{");
		int len = buf.length();
		toString(buf);
		if (buf.length() > len) {
			buf.setLength(buf.length() - 2);
		}
		buf.append('}');
		return buf.toString();
	}

	protected void toString(StringBuilder buf) {
		buf.append("emailFree").append('=').append(JodaBeanUtils.toString(isEmailFree())).append(',').append(' ');
	}

	//-----------------------------------------------------------------------
	/**
	 * The meta-bean for {@code CheckEmailResponse}.
	 */
	public static class Meta extends DirectMetaBean {
		/**
		 * The singleton instance of the meta-bean.
		 */
		static final Meta INSTANCE = new Meta();

		/**
		 * The meta-property for the {@code emailFree} property.
		 */
		private final MetaProperty<Boolean> emailFree = DirectMetaProperty.ofReadWrite(
				this, "emailFree", CheckEmailResponse.class, Boolean.TYPE);
		/**
		 * The meta-properties.
		 */
		private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
				this, null,
				"emailFree");

		/**
		 * Restricted constructor.
		 */
		protected Meta() {
		}

		@Override
		protected MetaProperty<?> metaPropertyGet(String propertyName) {
			switch (propertyName.hashCode()) {
				case 2120001576:  // emailFree
					return emailFree;
			}
			return super.metaPropertyGet(propertyName);
		}

		@Override
		public BeanBuilder<? extends CheckEmailResponse> builder() {
			return new DirectBeanBuilder<CheckEmailResponse>(new CheckEmailResponse());
		}

		@Override
		public Class<? extends CheckEmailResponse> beanType() {
			return CheckEmailResponse.class;
		}

		@Override
		public Map<String, MetaProperty<?>> metaPropertyMap() {
			return metaPropertyMap$;
		}

		//-----------------------------------------------------------------------
		/**
		 * The meta-property for the {@code emailFree} property.
		 * @return the meta-property, not null
		 */
		public final MetaProperty<Boolean> emailFree() {
			return emailFree;
		}

		//-----------------------------------------------------------------------
		@Override
		protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 2120001576:  // emailFree
					return ((CheckEmailResponse) bean).isEmailFree();
			}
			return super.propertyGet(bean, propertyName, quiet);
		}

		@Override
		protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
			switch (propertyName.hashCode()) {
				case 2120001576:  // emailFree
					((CheckEmailResponse) bean).setEmailFree((Boolean) newValue);
					return;
			}
			super.propertySet(bean, propertyName, newValue, quiet);
		}

	}

	///CLOVER:ON
	//-------------------------- AUTOGENERATED END --------------------------
}