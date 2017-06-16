var exec = require('cordova/exec');

var myMathFunc = function(){};

// exports.coolMethod = function(arg0, success, error) {
//     exec(success, error, "MyMath", "coolMethod", [arg0]);
// };

myMathFunc.prototype.plus= function(arg0, success, error) {
    exec(success, error, "MyMath", "plus", arg0);
};

myMathFunc.prototype.minus= function(arg0, success, error) {
    exec(success, error, "MyMath", "minus", arg0);
};

// var MYMATHFUNC = new myMathFunc();

module.exports = new myMathFunc();


// var exec = require('cordova/exec');
// var myMathFunc = function(){};   
// myMathFunc.prototype.plus = function(arg0, success, error) {
//     exec(success, error, "MyMath", "plus", arg0);
// };

// myMathFunc.prototype.minus = function(arg0, success, error) {
//     exec(success, error, "MyMath", "minus", arg0);
// };

// var MYMATHFUNC = new myMathFunc();
// module.exports = MYMATHFUNC;