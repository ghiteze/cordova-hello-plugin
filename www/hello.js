var cordova = require('cordova');

module.exports = {
  hi: function (name, success, failure) {
    cordova.exe(
      success,
      failure,
      "Hello",
      "hi",
      [name]
    );
  }
};
