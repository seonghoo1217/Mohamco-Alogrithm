//01:14:34
function check_winner(sang, frend) {
  if (sang === "S") {
    if (frend === "S") return 1;
    if (frend === "R") return 0;
    if (frend === "P") return 2;
  }
  if (sang === "R") {
    if (frend === "S") return 2;
    if (frend === "R") return 1;
    if (frend === "P") return 0;
  }
  if (sang === "P") {
    if (frend === "S") return 0;
    if (frend === "R") return 2;
    if (frend === "P") return 1;
  }
}
function solution(case1) {
  const input = case1.split("\n");
  // const R = +input[0];
  const sang = input[1].split("");
  const N = input[2];
  let score = 0;
  let result = 0;
  for (let i = 0; i < N; i++) {
    const frends = input[i + 3].split("");
    let max = 0;
    frends.forEach((frend, index) => {
      let S = 0;
      let P = 0;
      let R = 0;
      score += check_winner(sang[index], frend);
      S += check_winner("S", frend);
      P += check_winner("P", frend);
      R += check_winner("R", frend);
      max += Math.max(S, P, R);
    });
    result += max;
    max = 0;
  }
  return score + `\n` + result;
}
const case1 = `5
SSPPR
2
PPRRS
RRSSP`;

console.log(solution(case1));
