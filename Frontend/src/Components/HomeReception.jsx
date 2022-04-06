import React, { Fragment } from "react"
import {
  BrowserRouter,
  BrowserRouter as Router,
  Route,
  Routes
} from 'react-router-dom';
import NavReception from "./NavReception";
import Main from './Main';
const HomeReception=()=>{
  return (
    <div>  
    <NavReception/>
    <Main/>
    </div>
  )
};
export default HomeReception;