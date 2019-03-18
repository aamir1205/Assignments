package com.spring.service;

import java.util.List;
import java.util.Map;

import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class OrganisationEndPoint {
	
	 private static final String NAMESPACE_URI = "http://example.com/org/schemas";
	   
	
	   private OrganisationService orgService;
	   private XPathExpression<Element> idExpression;
	   
	   

	   public OrganisationEndPoint() {
		super();
	}


	@Autowired
	   public OrganisationEndPoint(OrganisationService orgService) {
		   this.orgService=orgService;
		   Namespace namespace = Namespace.getNamespace("org", NAMESPACE_URI);
	       XPathFactory xPathFactory = XPathFactory.instance();
	       idExpression = xPathFactory.compile("//org:id", Filters.element(), null, namespace);
	}


	@PayloadRoot(namespace=NAMESPACE_URI,localPart="getOrganisationDetailsRequest")
	   @ResponsePayload
	   public Element fetchEmployee(@RequestPayload Element incoming)
	   {
		  
		   String id=idExpression.evaluateFirst(incoming).getText();
		   System.out.println("found id"+id);
		   
		  // List<Employee> tempList= orgService.getOrgDetailsById(id);
		   
		   
		   Element outgoing= new Element("OrganisationDetailsResponse");
		 
		   outgoing.addNamespaceDeclaration(Namespace.getNamespace("tns",NAMESPACE_URI));
		  // Element org= new Element("Organisation");
		   
		   
		   for(int i=0;i<4;i++)
		   {
			 
		   Element employeeType= new Element("EmployeeType");
		   employeeType.addContent(new Element("Number").setText("111"));
		   employeeType.addContent(new Element("Name").setText("abc"));
		   employeeType.addContent(new Element("Address").setText("pune"));
		   outgoing.addContent(employeeType);
	
		   }
		   return outgoing;
	   }
	   
	

}
