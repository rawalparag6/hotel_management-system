import React from "react";
// import './card.css';
import './Button.css';
import { useState , useEffect} from "react";
import axios from "axios";
const Inventory=({ update})=>{
  const deleteInventory =(pId) =>{
    axios.delete("http://localhost:3001/inventory/delete/{pId}").then(
      (response) => {
        update(pId);
      },
      (error) => {
      
      }
    )
  };
  const getInventoryFromServer = () => {
    axios.get('http://localhost:3001/inventory/find').then(
    (response) => {
      console.log(response.data);
      setInventory(response.data);
    },
    (error) => {
      console.log(error);
    }
    );
  };
  useEffect(() => {
      getInventoryFromServer();
      
  }, []);
  const [inventory , setInventory] = useState([]);
  const updateInventory = (pId) => {
    setInventory(inventory.filter((i) => i.pId != pId));
  }

 
  return(
    <>
  <div class="container">
    {
      inventory.map((curElem)=>{
        return(
          <div>
            <div class="card">
    <div class="box">
      <div class="content">
      <tr>
                <td><strong>Product Id:</strong></td>
                <td>{curElem.pId}</td>
            </tr>
            <tr>
                <td><strong>Product Name:</strong></td>
                <td>{curElem.pName}</td>
            </tr>
            <tr>
                <td><strong>Quantity:</strong></td>
                <td>{curElem.pQuantity}</td>
            </tr>
            <tr>
                <td><strong>Cost:</strong></td>
                <td>{curElem.pCost}</td>
            </tr>
        <div className="center" >
         <button className="cta1" onClick={() => { deleteInventory(inventory.pId)}}> Delete</button>
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
export default Inventory;