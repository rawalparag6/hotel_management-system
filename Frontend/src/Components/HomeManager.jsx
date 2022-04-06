import React, { Fragment } from "react"
import {
  BrowserRouter,
  BrowserRouter as Router,
  Route,
  Routes
} from 'react-router-dom';
import NavManager from "./NavManager";
import Main from './Main';
const HomeManager=()=>{
  return (
    <div>  
    <NavManager/>
    <Main/>
    </div>
  )
};
export default HomeManager;