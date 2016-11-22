module.exports = {
  hi: function (name, success, failure) {
    cordova.exec(
      success,
      failure,
      "Hello",
      "hi",
      [name]
    );
  }
};
