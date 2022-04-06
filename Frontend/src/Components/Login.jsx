import React from "react";
import { Link , useNavigate} from "react-router-dom";
import axios from "axios";
import { useState } from "react";
const Login = () =>{
  var auth = JSON.stringify(localStorage.getItem("auth"));

  const nav = useNavigate();


  const [input, setInput] = useState({
    username: "",
    password: "",
    role: "",
  });

  const inputEvent = (event) => {
    const { name, value } = event.target;
    setInput((previousvalue) => {
      console.log(previousvalue.data);
      return {
        ...previousvalue,
        [name]: value,
      };
    });
  };
  const showdata = async (event) => {
    event.preventDefault();

    try {
     
      const { data } = await axios.post("http://localhost:8682/auth", {
        username: input.username,
        password: input.password,
        
      });
      console.log(data.response);
      localStorage.setItem("jwt", JSON.stringify(data.response));
      if (data.response ){
        const{data} = await axios.get("http://localhost:8682/"+input.username)
        console.log(input.username)
     if(data==='owner'){
       nav('/homeowner')
     }
     if(data==='manager'){
       nav("/homemanager")
     }
     if(data==='receptionist'){
       nav("/homereception")
     }
      } 
      else{
        alert("fail")
      }
    
    } catch (error) {
      console.log("error is", error);
    }
  };

    return (
        <>
       
       <div class="login-form">
  <form>
    <h1>Login</h1>
    <div class="content">
      <div class="input-field">
        <input type='text' placeholder="username"  name="username"
                onChange={inputEvent}value={input.username}/>
      </div>
      <div class="input-field">
        <input type="password" placeholder="Password" name="password"
              onChange={inputEvent}value={input.password}/>
      </div>
     <Link to='/register'><a class="link">Create Account!</a></Link>
    </div>
    <div class="action">
      <button onClick={showdata}>Login</button>
    </div>
  </form>
  </div>
  
       </>
    )
};
export default Login;

