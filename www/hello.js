module.exports = {
  open: function (name, success, failure) {
    cordova.exec(success, failure, "Hello", "open", [name] );
  }
};
