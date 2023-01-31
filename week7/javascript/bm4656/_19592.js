//?
function solution(data) {
  let [T, ...arr] = data.toString().trim().split('\n');
  // console.log(arr);
  let answer = [];
  for (let i = 0; i < T; i++) {
    const [N, X, Y] = arr.shift().split(' ').map(Number);
    const V = arr.shift().split(' ').map(Number);
    let max = Math.max(...V);
    if (max === V[N - 1] && V.filter(v => v === max).length === 1) {
      answer.push(0);
      continue;
    }
    let lt = 0;
    let rt = Y;
    const min = X - V[N - 1] * (X / max - 1);
    if (rt <= min) {
      answer.push(-1);
      continue;
    }
    let mid = Math.floor((lt + rt) / 2);
    while (lt <= rt) {
      mid = Math.floor((lt + rt) / 2);
      if (mid <= min) lt = mid + 1;
      else rt = mid - 1;
    }
    answer.push(lt);
  }
  return answer.join('\n');
}

const case1 = `5
3 12 11
3 2 1
3 12 9
3 2 1
3 12 10
3 4 5
3 80 80
80 60 70
3 80 80
70 50 60`;

console.log(solution(case1));
