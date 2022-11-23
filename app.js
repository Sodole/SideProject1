const express = require("express");
// const http = require("http");
const app = express();
const fs = require("fs")

app.use((req, res) => {
    console.log(req.query)
    let {stock, value} = req.query
    fs.writeFile("C:\\Users\\82103\\Desktop\\test2.csv", `${stock}, ${value}`, () => {})
    res.send("성공");
});

app.listen(4003, () => {
    console.log("4003 서버")
})