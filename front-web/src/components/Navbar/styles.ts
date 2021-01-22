import styled from 'styled-components';

export const Nav = styled.nav`
  height: 70px;
  background-color: var(--primary-color);
  padding-left: 2.5rem;
  display: flex;
  align-items: center;

  .logo-image {
    width: 45px;
    height: 45px;
    filter: invert();
    transform: rotateY(180deg);
  }

  .logo-text {
    font-weight: bold;
    font-size: 1.8rem;
    line-height: 2rem;
    color: #fff;
    margin-left: 1rem;
  }
`;
