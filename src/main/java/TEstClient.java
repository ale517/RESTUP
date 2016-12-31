import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import up.cloudcomputing.bean.DB;
import up.cloudcomputing.bean.PersistenceBean;
import up.cloudcomputing.bean.Properties;
import up.cloudcomputing.model.Pessoa;

public class TEstClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* class ClientService {
	
	public void createContact(Pessoa pessoa){
		
		System.out.println("insideCreateContact");
		ClientBuilder cb=ClientBuilder.newBuilder();
		Client c= cb.build();
		String res= null;
		
		
		try { 
			
			Properties item= new Properties();
			item.setApp("JavaServlets-6");
			item.setNome(pessoa.getNome());
			item.setEndereco(pessoa.getEndereco());
			item.setEmail(pessoa.getEmail());
			item.setDataNascimento(pessoa.getDataNascimento());
			
			//Preparing DB object
			DB dbItem= new DB(); 
			dbItem.setProperties(item);
			//Finalizing the Objects instance                    
			List<DB> list= new ArrayList<DB>(); 
			list.add(dbItem);                  
			PersistenceBean bean= new PersistenceBean(); 
			bean.setDB(list);
			
			
			
			
			
			res=c.target("http://localhost:9080/MicroService/rest/create").request(MediaType.APPLICATION_JSON).post(Entity.entity(bean, MediaType.APPLICATION_JSON),String.class);
			
			System.out.println(res);
		}catch (Exception e){
			res="[ERROR]:"+e.toString();
		}finally {
			c.close();
		}
		
		
	}
	

}*/
