const express=require("express");
const path=require("path");
const app=express();
const router=require("./UserRoutes");
app.get("/",(req,res)=>{
    res.sendFile(__dirname+"./index.html")
})
app.post("/",(req,res)=>{
    const userName=req.body.name;
})

app.listen(5000,()=>{

    console.log("server is working on port 5000")
})