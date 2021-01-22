import styled from 'styled-components';

export const HomeContainer = styled.article`
  padding-top: 6.2rem;

  .home-content {
    display: flex;
    justify-content: center;
  }

  .home-title {
    font-weight: bold;
    font-size: 3.2rem;
    line-height: 3.6rem;
    color: var(--dark-color);
    margin-bottom: 1.4rem;
  }

  .home-subtitle {
    font-weight: normal;
    font-size: 1.4rem;
    line-height: 2rem;
    color: var(--secondary-color);
    margin-bottom: 2em;
  }

  .home-btn {
    background-color: var(--primary-color);
    border-radius: 10px;
    height: 4rem;
    width: 15rem;
    display: flex;
    align-items: center;
    justify-content: center;
    font-weight: bold;
    font-size: 1.5rem;
    color: #fff;
  }

  .home-btn:hover {
    background-color: var(--primary-hover-color);
    transform: scale(1.01);
  }

  .home-image {
    height: 24rem;
    margin-left: 2rem;
  }
`;
