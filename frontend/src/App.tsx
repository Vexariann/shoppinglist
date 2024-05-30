import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

const App = () => {
  const [items, setItems] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/api/v1/shopping-list-items").then(result =>
      result.json().then(setItems))
  })

  return <ul>{items.map(item => <li key={item}>{item}</li>)}</ul>
}

export default App;
