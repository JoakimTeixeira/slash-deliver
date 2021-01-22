import React from 'react';
import './App.css';
import GlobalStyle from './styles/global';
import { Navbar } from './components/Navbar';

function App() {
  return (
    <>
      <GlobalStyle />
      <Navbar />
    </>
  );
}

export default App;
