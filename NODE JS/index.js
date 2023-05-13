const http=require("http");
const fs=require("fs");
const express=require("express");
const app=express();
const PORT=2000;

//const home=fs.readFileSync("./index.html","utf-8");

// const server=http.createServer((req,res)=>{
//     if(req.url==="/"){
//         console.log("hello");
//          res.end("home");
//     }
    
// });
app.get('/',(req,res)=>{
    res.send("api call")
})

app.listen(5000,()=>{
console.log("server is working on 5000)");
});