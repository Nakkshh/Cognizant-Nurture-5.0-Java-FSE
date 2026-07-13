import CalculateScore from "./Components/CalculateScore";

function App() {

  return (
    <div>
      <CalculateScore
        name="Nakshatra Jain"
        school="VIT Bhopal"
        total={480}
        goal={6}
      />
    </div>
  );

}

export default App;