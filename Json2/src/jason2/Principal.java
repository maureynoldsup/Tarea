package jason2;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
public class Principal {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//De java a Json
		Persona per= new Persona();
		per.llenado(4040790,"Mauricio","Reynolds","Obrajes",70730050);
		JSONObject obj = new JSONObject();
		obj.put("persona",per);
		obj.put("Carnet", per.carnet);
		obj.put("nombre", per.nombre);
		obj.put("apellido",per.apellido);
		obj.put("direccion", per.direccion);
		obj.put("telefono", per.telefono);
        System.out.println(obj);
        
        //De Json a Java
        System.out.println("");
        String s = "[0,{\"4040790\":{\"Mauricio\":{\"Reynolds\":{\"Obrajes\":[70730050,{\"Cochabamba\":7}]}}}}]";
        Object obje = JSONValue.parse(s);
        JSONArray array = (JSONArray) obje;
        System.out.println("======En Jason======");
        System.out.println(array.get(1));
        System.out.println();
 
        JSONObject obj2 = (JSONObject) array.get(1);
        System.out.println("----------En Java---------");
        System.out.println(obj2.get("4040790"));
 
	}
}
