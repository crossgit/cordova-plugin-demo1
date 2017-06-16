
import Foundation

@objc(MyMath)class MyMath:CDVPlugin{
    func plus(_ command:CDVInvokedUrlCommand){
        print(command.arguments)
        var pluginResult=CDVPluginResult(status:CDVCommandStatus_ERROR)
        
        let A = command.arguments[0] as? Int ?? 0
        let B = command.arguments[1] as? Int ?? 0
        
        let ret = A+B
        if ret<100 {
            pluginResult=CDVPluginResult(status: CDVCommandStatus_OK, messageAs: ret)
        }else {
            pluginResult=CDVPluginResult(status: CDVCommandStatus_OK, messageAs: "加法错了")
        }
        
        self.commandDelegate.send(pluginResult, callbackId:  command.callbackId)
    }
    
    func minus(_ command:CDVInvokedUrlCommand){
        print(command.arguments)
        var pluginResult=CDVPluginResult(status:CDVCommandStatus_ERROR)
        
        let A = command.arguments[0] as? Int ?? 0
        let B = command.arguments[1] as? Int ?? 0
        
        let ret = A-B
        if A<B {
           pluginResult=CDVPluginResult(status: CDVCommandStatus_OK, messageAs: ret)
        }else {
             pluginResult=CDVPluginResult(status: CDVCommandStatus_OK, messageAs: "减法法错了")
        }
        
        self.commandDelegate.send(pluginResult, callbackId:  command.callbackId)
    }

}
