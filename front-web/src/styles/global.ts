import { createGlobalStyle } from 'styled-components';

const GlobalStyle = createGlobalStyle`

  :root {
    --primary-color: #f9674e;
    --primary-hover-color: #F74626;
    --dark-color: #263238;
    --secondary-color: #406e8e;
    --light-color: #F5F5F5;
  }  
  
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }

  body {
    color: #000;
    -webkit-font-smoothing: antialiased;
    font-size: 1rem;
    font-family: Roboto, sans-serif
  }

  button {
    cursor: pointer;
  }

  a {
    text-decoration: none;
  }
`;

export default GlobalStyle;
