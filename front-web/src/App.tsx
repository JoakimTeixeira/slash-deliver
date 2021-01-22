import React from 'react';
import './App.css';
import GlobalStyle from './styles/global';
import { Navbar } from './components/Navbar';
import Home from './pages/Home';

function App() {
  return (
    <>
      <GlobalStyle />
      <Navbar />
      <Home />
    </>
  );
}

export default App;
