package up.cloud.computing;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.ibm.json.java.JSON;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

import up.cloudcomputing.bean.PersistenceBean;

@Path("/rest")
public class PresistenceService {

	@Path("/test")
	@GET
	@Produces("application/json")
	public String getInformation() throws Exception, IOException {
		JSONObject myJSONObj = new JSONObject();
		myJSONObj.put("message", "Hello World!");
		return myJSONObj.toString();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/search")
	public String searchContato(String json) {

		Gson gson = new Gson();

		System.out.println("search");
		System.out.println(json);

		PersistenceBean bean = gson.fromJson(json, PersistenceBean.class);

		if (bean != null) {
			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-6")) {

				System.out.println("create" + "JavaServlets-6");
			}

			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-2")) {
				System.out.println("create" + "JavaServlets-2");
			}
		}

		return "SearchContato";
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(String  json) {
		System.out.println("create");

		Gson gson = new Gson();

		System.out.println("search");
		System.out.println(json);

		PersistenceBean bean = gson.fromJson(json, PersistenceBean.class);

		if (bean != null) {
			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-6")) {

				System.out.println("create" + "JavaServlets-6");
			}

			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-2")) {
				System.out.println("create" + "JavaServlets-2");
			}

		}

		return Response.ok().entity("Persistence OK create").build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Response update(String json) {

		Gson gson = new Gson();

		System.out.println("update");
		System.out.println(json);

		PersistenceBean bean = gson.fromJson(json, PersistenceBean.class);

		if (bean != null) {
			
			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-6")) {

				System.out.println("create" + "JavaServlets-6");
			}

			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-2")) {
				System.out.println("create" + "JavaServlets-2");
			}
		}
		return Response.ok().entity("Persistence OK update").build();
		
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/delete")
	public String delete(String json) {

		Gson gson = new Gson();

		System.out.println("delete");
		System.out.println(json);

		PersistenceBean bean = gson.fromJson(json, PersistenceBean.class);

		if (bean != null) {
			
			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-6")) {

				System.out.println("create" + "JavaServlets-6");
			}

			if (bean.getDB().get(0).getProperties().getApp().equals("JavaServlets-2")) {
				System.out.println("create" + "JavaServlets-2");
			}
		}
		return "delete OK";

	}

}