const registerUser=(req,res)=>{
    const userName=req.body.name;
const userEmail=req.body.Email;
const userPassword=req.body.passWord;


res.json({
success:true 

});
};
module.exports=registerUser;