//00:21:46
function solution(case1) {
  const input = case1.split("\n");
  const n = +input[0];
  const i = input[1].split(" ").map(Number);
  let max = 0;
  let c = 0;
  for (let k = 0; k < n; k++) {
    if (max < i[k]) {
      max = i[k];
    }
    c += i[k];
  }
  return (c -= max);
}

const case1 = `4
100 100 100 101`;

console.log(solution(case1));
