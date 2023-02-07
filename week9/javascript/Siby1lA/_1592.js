//00:16:00
function solution(case1) {
  const [N, M, L] = case1.split(" ").map(Number);
  const arr = Array.from({ length: N + 1 }, () => 0);
  let ball = 1;
  let answer = 0;
  arr[1] = 1;
  while (!arr.includes(M)) {
    if (arr[ball] % 2) {
      ball += L;
      if (ball > N) ball -= N;
    } else {
      ball -= L;
      if (ball < 1) ball += N;
    }
    arr[ball] += 1;
    answer++;
  }
  return answer;
}

const case1 = `5 3 2`;

console.log(solution(case1));
