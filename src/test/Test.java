package test;

import java.util.HashMap;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;

public class Test {
	public static void main(String[] args) {
		AlchemyLanguage service = new AlchemyLanguage();
		service.setApiKey("96887abb2b35315e4abe39b894ba91c10c846961");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put(AlchemyLanguage.TEXT, "IBM Watson won the Jeopardy television show hosted by Alex Trebek");
		DocumentSentiment sentiment = service.getSentiment(params);

		System.out.println(sentiment);
	}

}
