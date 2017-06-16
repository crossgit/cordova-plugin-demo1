package SimpleMath;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MyMath extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // if (action.equals("coolMethod")) {
        //     String message = args.getString(0);
        //     this.coolMethod(message, callbackContext);
        //     return true;
        // }
        // return false;
         int A = args.getInt(0);
            int B = args.getInt(1);
        if(action.equals("plus")){ 
            //  log.d("plus","plus");
            this.plus(A,B,callbackContext);
            return true;
        }else if (action.equals("minus")){
            //  log.d("minus","minus");
            this.minus(A,B,callbackContext);
            return true;
        }

         return false;
    }

    // private void coolMethod(String message, CallbackContext callbackContext) {
    //     if (message != null && message.length() > 0) {
    //         callbackContext.success(message);
    //     } else {
    //         callbackContext.error("Expected one non-empty string argument.");
    //     }
    // }

    private void plus(int A,int B,CallbackContext callbackContext){
        int ret = A+B;
        if (ret <100){
            callbackContext.success(ret);
        }else {
            callbackContext.error("a+b must be smaller than 100!");
        }
    }

    private void minus(int A,int B,CallbackContext callbackContext){
        int ret = A-B;

        if(ret>0){
            callbackContext.success(ret);
        }
        else {
            callbackContext.error("a must be bigger than b!");
        }
        
    }
}
// package SimpleMath;

// import org.apache.cordova.CordovaPlugin;
// import org.apache.cordova.CallbackContext;

// import org.json.JSONArray;
// import org.json.JSONException;
// import org.json.JSONObject;

// /**
//  * This class echoes a string called from JavaScript.
//  */
// public class MyMath extends CordovaPlugin {

//     @Override
//     public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
//         int A  = args.getInt(0);
//             int B  =  args.getInt(1); 
//         if (action.equals("Plus")) {
//             // int A  = args.getInt(0);
//             // int B  =  args.getInt(1); 
//             this.plus(A,B, callbackContext);
//             return true;//注意一定要返回 true
//         }else if(action.equals("Minus"))
//         {
//         	// int A  = args.getInt(0);         
//         	// int B  =  args.getInt(1);        
//         	this.minus(A,B, callbackContext);
//         	return true;  //注意一定要返回 true 
//         }
//         return false;
//     }

//     private void plus(int A, int B,CallbackContext callbackContext) {
        
//     	int ret = A + B;
    	
//     	if (ret < 100) {
//             callbackContext.success(ret);
//         } else {
//             callbackContext.error("A + B must be smaller than 100");
//         }
//     }
    
//     private void minus(int A, int B,CallbackContext callbackContext) {       
                                                                            
//         	int ret = A - B;                                                    
        	                                                                    
//         	if (ret > 0) {                                                   
//                 callbackContext.success(ret);                                   
//             } else {                                                            
//                 callbackContext.error("A must be bigger than B");        
//             }                                                                   
//         }                                                                       
// }                                                                           