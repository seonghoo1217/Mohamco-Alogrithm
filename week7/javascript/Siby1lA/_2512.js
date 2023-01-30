//00:17:14
function solution(case1) {
  const input = case1.split("\n");
  const [N, R, M] = [+input[0], input[1].split(" ").map(Number), +input[2]];
  R.sort((a, b) => a - b);
  let left = 0;
  let right = R[N - 1];
  let answer = Number.MIN_SAFE_INTEGER;
  while (left <= right) {
    let mid = Math.floor((left + right) / 2);

    let sum = 0;
    for (let x of R) {
      if (x > mid) sum += mid;
      else sum += x;
    }
    if (M >= sum) {
      if (mid > answer) answer = mid;
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }

  return answer;
}
const case1 = `4
120 110 140 150
485`;

console.log(solution(case1));
