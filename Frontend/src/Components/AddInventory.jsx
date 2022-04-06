import React from "react";
import axios from "axios";
import NavManager from "./NavManager";
const AddInventory=()=>{
  // useEffect(() => {
  //   document.title= "add inventory";
  // }, [])
  function i1(e){
    e.preventDefault();
    let pId=document.getElementById("pId").value;
    let pName=document.getElementById("pName").value;
    let pQuantity=document.getElementById("pQuantity").value;
    let pCost=document.getElementById("pCost").value;
    axios.post("http://localhost:3001/inventory/add",{pId:pId,pName:pName,pQuantity:pQuantity,pCost:pCost} );
}

    return(
      <>    
      <NavManager/>
    <div className="login-form">
    <form >
      <h1>Add Product</h1>
      <div className="content">
      <div className="input-field">
          <input id='pId' placeholder="Product Id" required />
        </div>
      <div className="input-field">
          <input id='pName' placeholder=" Product Name" required />
        </div>
        <div className="input-field">
          <input id='pQuantity' placeholder="Quantity" required />
        </div>
        <div className="input-field">
          <input id='pCost' placeholder="Cost" required />
        </div>
        
      </div>
      <div className="action">
        <button onClick={i1}>Add</button>
        <button type="reset">Cancle</button>
      </div>
      
      </form>

  </div>
  </>

    ) 
};
export default AddInventory;