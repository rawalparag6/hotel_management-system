import React from "react";
import { useState , useEffect} from "react";
import './Button.css';
import './card.css';
import axios from "axios";
const Department=()=>{
  const [department , setDepartment] = useState([]);
  
  const getDepartmentFromServer = () => {
    axios.get('http://localhost:9002/department/find').then(
    (response) => {
      console.log(response.data);
      setDepartment(response.data);
    },
    (error) => {
      console.log(error);
    }
    );
  };
  const deleteDepartment = (dId) => {

    try {
        if (
            axios.delete("http://localhost:9002/department/delete/" +dId)
                .then(response => {
                    console.log(response);
                    getDepartmentFromServer();

                })) { alert("department with id " + dId + " is removed") }
    }
    catch (error) {
        console.log("error is", error)
    };

}
  useEffect(() => {
      getDepartmentFromServer();
      
  }, []);


  return(
    <>
 <div class="container">
    {
      department.map((curElem)=>{
        return(
          <div>
            <div class="card">
    <div class="box">
      <div class="content">
      <div key={department.Id} >
           <tr>
           <td><strong>Department Id</strong></td>
             <td>{curElem.dId}</td>
        </tr>
        <tr>
             <td><strong>Department Name</strong></td>
             <td>{curElem.dName}</td>
         </tr>
         <tr>
             <td><strong>No. of employees</strong></td>
             <td>{curElem.employee}</td>
         </tr>
    <div className="center" >
      <button className="cta1" onClick={() => deleteDepartment(curElem.dId)}> Delete</button>
    </div>
    </div>
    </div>
  </div>
  </div>
  </div>)
      }
      )
        }
   </div>
  
   </>
  )

}   
export default Department;