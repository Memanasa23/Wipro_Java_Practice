var HttpStatus;
(function (HttpStatus) {
    HttpStatus[HttpStatus["OK"] = 200] = "OK";
    HttpStatus[HttpStatus["NOTFOUND"] = 404] = "NOTFOUND";
    HttpStatus[HttpStatus["ACCESSDENIED"] = 403] = "ACCESSDENIED";
    HttpStatus[HttpStatus["INTERNALERROR"] = 500] = "INTERNALERROR";
})(HttpStatus || (HttpStatus = {}));
console.log(HttpStatus.OK);
console.log(HttpStatus.NOTFOUND);
console.log(HttpStatus.ACCESSDENIED);
console.log(HttpStatus.INTERNALERROR);
