import React, { Fragment , useEffect , useState } from "react";
import axios from "axios";
import NavOwner from "./NavOwner";
const Adddepartment=()=>{
  useEffect(() => {
    document.title= "Department";
  }, [])
  function d1(e){
    e.preventDefault();
    let dId=document.getElementById("dId").value;
    let dName=document.getElementById("dName").value;
    let employee=document.getElementById("employee").value;
    axios.post("http://localhost:9002/department/add",{dId:dId,dName:dName,employee:employee} );
}
    return(
      <>
      <NavOwner/>
    <div className="login-form">
    <form >
      <h1>Add Department</h1>
      <div className="content">
      <div className="input-field">
          <input id='dId' placeholder="dId" required />
        </div>
      <div className="input-field">
          <input id='dName' placeholder="dName" required />
        </div>
        <div className="input-field">
          <input id='employee' placeholder="employee" required />
        </div>
        
      </div>
      <div className="action">
        <button onClick={d1}>Add</button>
        <button type="reset">Cancle</button>
      </div>
      
      </form>

  </div>
  </>

    )
   
};
export default Adddepartment;