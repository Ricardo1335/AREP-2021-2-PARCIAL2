package edu.escuelaing.arep.app.Spark;

import static spark.Spark.*;

import edu.escuelaing.arep.app.Calculator;
import org.json.JSONObject;
import static spark.Spark.*;
import com.google.gson.Gson;

public class SparkServer 
{
    public static void main( String[] args )
    {
        
        port(getPort());
        get("/ln", (req, res) -> {
            JSONObject json = new JSONObject();
            Double value = Double.parseDouble(req.queryParams("value"));
            Calculator calculator = new Calculator();
            json.put("output",calculator.ln(value));
            json.put("input",value);
            json.put("operation","ln");
            return json;
        });

        get("/atan", (req,res) -> {
            JSONObject json = new JSONObject();
            Double value = Double.parseDouble(req.queryParams("value"));
            Calculator calculator = new Calculator();
            json.put("output",calculator.atan(value));
            json.put("input",value);            
            json.put("operation","atan");
            return json;
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
