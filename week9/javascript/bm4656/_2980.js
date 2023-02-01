//00:30:33
function solution(data) {
  let input = data.trim().split('\n');
  const [n, l] = input[0].split(' ').map(Number);
  let t = 0;
  let pre = 0;

  for (let i = 1; i <= n; i++) {
    const [d, r, g] = input[i].split(' ').map(Number);

    t += d - pre;
    pre = d;

    let red = t % (r + g);
    if (red <= r) {
      t += r - red;
    }
  }
  return t + (l - pre);
}

const case1 = `2 10
3 5 5
5 2 2`;
const case2 = `4 30
7 13 5
14 4 4
15 3 10
25 1 1`;

console.log(solution(case1));
console.log(solution(case2));
