package br.com.soctest.config;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class WebServiceConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispacherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<MessageDispatcherServlet>(messageDispatcherServlet, "/exame/*");

	}

	@Bean
	public XsdSchema schemaExame() {
		return new SimpleXsdSchema(new ClassPathResource("exame-informacao.xsd"));
	}

	@Bean(name = "exames")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schemaExame) {
		DefaultWsdl11Definition definicao = new DefaultWsdl11Definition();
		definicao.setPortTypeName("ExamePort");
		definicao.setTargetNamespace("http://soctest.com.br");
		definicao.setLocationUri("/exame");
		definicao.setSchema(schemaExame);
		return definicao;
	}

	
}
