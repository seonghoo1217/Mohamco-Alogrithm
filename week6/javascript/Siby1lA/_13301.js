//00:26:08
function solution(case1) {
  const N = +case1;
  let arr = [0, 1, 1];
  let anser = 0;
  if (N === 1) {
    return 4;
  }
  if (N === 4) {
    return 6;
  }
  for (let i = 2; i < 80; i++) {
    arr.push((arr[i] = arr[i - 1] + arr[i - 2]));
  }
  const w = arr[N] + arr[N - 1];
  const h = arr[N];
  anser = 2 * (w + h);
  return anser;
}
const case1 = `6`;

console.log(solution(case1));
