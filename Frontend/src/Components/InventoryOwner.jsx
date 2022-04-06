import React from "react";
import { Link } from "react-router-dom";
import Inventory from "./Inventory";
import NavOwner from "./NavOwner";

const InventoryOwner =()=>{
    return (
        <>
        <NavOwner/>
       <Inventory/>
        </>
    )
};
export default InventoryOwner;
