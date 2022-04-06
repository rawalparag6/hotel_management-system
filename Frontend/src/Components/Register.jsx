import React from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import { useState } from "react";
const Login = () =>{
  const [username, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("");

  const handleSubmitt = async () => {
    const config = {
      headers: {
        "Content-Type": "application/json",
      },
    };
    const handleData = {
      username,
      password,
      role,
     
    };
    const { data } = await axios.post(
      "http://localhost:8682/subs",
      handleData,
      config
    );
    console.log(data);
  };
    return (
        <>
       <div class="login-form">
  <form>
    <h1>Register</h1>
    <div class="content">
    <a className="link">
        Select Role
      <br />
        <select name="" id="" onChange={(e)=>setRole(e.target.value)}>
        <option defaultValue>--Select--</option>
          <option value="manager">Manager</option>
          <option value="receptionist">Receptionist</option>
        </select><br/></a>
      <div class="input-field">
        <input type="username" placeholder="Username" onChange={(e) => setUserName(e.target.value)}/>
      </div>
      <div class="input-field">
        <input type="password" placeholder="Password" onChange={(e) => setPassword(e.target.value)}/>
      </div>
      <Link to='/'><a class="link">Go Back to Login!</a></Link>
    </div>
    <div class="action">
      <button onClick={handleSubmitt}>Submit</button>
    </div>
  </form>
</div>

        </>
    )
};
export default Login;

