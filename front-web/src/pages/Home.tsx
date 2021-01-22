import React from 'react';
import { ReactComponent as HomeImage } from '../assets/home-image.svg';
import { HomeContainer } from './styles';

const Home = () => {
  return (
    <HomeContainer>
      <div className="home-content">
        <div>
          <h1 className="home-title">
            So fast that
            <br /> cuts the wind!
            <br /> Slash today!
          </h1>
          <h2 className="home-subtitle">
            Choose your order and <br /> we deliver it within minutes!
          </h2>
          <a href="!#" className="home-btn">
            ORDER NOW!
          </a>
        </div>

        <HomeImage className="home-image" />
      </div>
    </HomeContainer>
  );
};

export default Home;
