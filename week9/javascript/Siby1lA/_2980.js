//00:14:25
function solution(case1) {
  const input = case1.split("\n");
  const [N, L] = input.shift().split(" ").map(Number);
  let time = 0;
  let distance = 0;
  for (let i = 0; i < N; i++) {
    let [D, R, G] = input[i].split(" ").map(Number);
    time += D - distance;
    distance = D;
    let check = time % (R + G);
    if (check < R) {
      time += R - check;
    } else {
      continue;
    }
  }
  return (time += L - distance);
}

const case1 = `2 10
3 5 5
5 2 2`;

console.log(solution(case1));
