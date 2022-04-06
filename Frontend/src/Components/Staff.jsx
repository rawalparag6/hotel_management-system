import React from "react";
import { useState , useEffect} from "react";
import './card.css';
import './Button.css';
import axios from "axios";
const Staff=()=>{

const [data, setData] = useState([]);

const getStaff = () => {
  

    try {

        axios.get("http://localhost:9009/staff/find")
            .then(response => {
                console.log(response.data);
                setData(response.data)
            })
    }
    catch (error) {
        console.log(error)
    };

}
const deleteStaff = (staffId) => {

    try {
        if (
            axios.delete("http://localhost:9009/staff/delete/" +staffId)
                .then(response => {
                    console.log(response);
                    getStaff();

                })) { alert("Staff with id " + staffId + " is removed") }
    }
    catch (error) {
        console.log("error is", error)
    };

}
useEffect(() => {
    getStaff();



}, []);

 
  return(
    <>
    <div class="container">
    {
      data.map((curElem)=>{
        return(
          <div>
        <div class="card">
    <div class="box">
      <div class="content">
        <div key={data.staffId} >
        <tr>
            <td><strong>Staff Id</strong></td>
            <td>{curElem.staffId}</td>
        </tr>
      <tr>
            <td><strong>Name</strong></td>
            <td>{curElem.name}</td>
        </tr>
        <tr>
            <td><strong>Email</strong></td>
            <td>{curElem.email}</td>
        </tr>
        <tr>
            <td><strong>Address</strong></td>
            <td>{curElem.address}</td>
        </tr>
        <tr>
            <td><strong>Department</strong></td>
            <td>{curElem.department}</td>
        </tr>
        <tr>
            <td><strong>Salary</strong></td>
            <td>{curElem.salary}</td>
        </tr>
      <div className="center" >
     <button className="cta1" onClick={() => { deleteStaff(curElem.staffId)}}> Delete</button>
    </div>
    </div>
    </div>
    </div>
  </div>
  </div>

   
        )
      }
      )
    }
     </div>
  
    </>
  )

}

export default Staff;