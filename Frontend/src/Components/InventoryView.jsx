import React from "react";
import { Link } from "react-router-dom";
import Inventory from "./Inventory";
import NavManager from "./NavManager";
const InventoryView = () =>{
    return (
        <>
        <NavManager/>
        <a href="/AddInventory"><button className="cta">Add Inventory</button></a>   
        <Inventory/>
        </>
    )
};
export default InventoryView;
