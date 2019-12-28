package springobjectwith2_xmls;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		XmlBeanFactory factory2 = new XmlBeanFactory(new ClassPathResource("spring2.xml"), factory);
		Traveller bean = factory2.getBean("id4", Traveller.class);
		bean.startJourney();
	}
}
