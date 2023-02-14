//00:15:28
function solution(case1) {
  const [N, K] = case1.split(" ").map(Number);
  const arr = [];
  for (let i = 2; i <= N; i++) {
    arr.push(i);
  }
  let count = 0;
  let prime;
  let nth;
  while (count < K) {
    prime = arr[0];
    arr.forEach((v) => {
      if (v % prime === 0) {
        arr.splice(arr.indexOf(v), 1);
        nth = v;
        count++;
      }
      if (count === K) return true;
    });
  }
  return nth;
}

const case1 = `15 12`;

console.log(solution(case1));
