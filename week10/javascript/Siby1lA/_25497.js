//00:07:50
function solution(case1) {
  const [N, SKILLS] = case1.split("\n");
  let count = 0;
  let l = 0;
  let s = 0;
  for (let i = 0; i < N; i++) {
    if (isNaN(SKILLS[i])) {
      if (SKILLS[i] === "L") {
        l += 1;
      }
      if (SKILLS[i] === "R") {
        if (l > 0) {
          count += 1;
          l -= 1;
        } else break;
      }
      if (SKILLS[i] === "S") {
        s += 1;
      }
      if (SKILLS[i] === "K") {
        if (s > 0) {
          count += 1;
          s -= 1;
        } else break;
      }
    } else count += 1;
  }
  return count;
}

const case1 = `5
S12K2`;

console.log(solution(case1));
