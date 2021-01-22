import React from 'react';
import { ReactComponent as Logo } from '../../assets/logo.svg';
import { Nav } from './styles';

const NavBar = () => {
  return (
    <div>
      <Nav>
        <Logo className="logo-image" />
        <a href="!#" className="logo-text">
          Slash Delivery
        </a>
      </Nav>
    </div>
  );
};

export default NavBar;
