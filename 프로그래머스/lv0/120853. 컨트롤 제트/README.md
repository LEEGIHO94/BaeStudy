# [level 0] 컨트롤 제트 - 120853 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120853) 

### 성능 요약

메모리: 76.9 MB, 시간: 0.26 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

<br/>정확성: 100.0<br/>합계: 100.0 / 100.0

### 문제 설명

<p style="user-select: auto;">숫자들이 공백으로 구분된 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 “Z”가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 “Z”로 이루어진 문자열 <code style="user-select: auto;">s</code>가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">0 &lt; <code style="user-select: auto;">s</code>의 길이 &lt; 1,000</li>
<li style="user-select: auto;">-1,000 &lt; <code style="user-select: auto;">s</code>의 원소 중 숫자 &lt; 1,000</li>
<li style="user-select: auto;"><code style="user-select: auto;">s</code>는 숫자, "Z", 공백으로 이루어져 있습니다.</li>
<li style="user-select: auto;"><code style="user-select: auto;">s</code>에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.</li>
<li style="user-select: auto;">연속된 공백은 주어지지 않습니다.</li>
<li style="user-select: auto;">0을 제외하고는 0으로 시작하는 숫자는 없습니다.</li>
<li style="user-select: auto;"><code style="user-select: auto;">s</code>의 시작과 끝에는 공백이 없습니다.</li>
<li style="user-select: auto;">모든 숫자를 지우는 경우는 주어지지 않습니다.</li>
<li style="user-select: auto;">지울 숫자가 없는 상태에서 "Z"는 무시합니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">s</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">"1 2 Z 3"</td>
<td style="user-select: auto;">4</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"10 20 30 40"</td>
<td style="user-select: auto;">100</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">"10 Z 20 Z 1"</td>
<td style="user-select: auto;">1</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">본문과 동일합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">10 + 20 + 30 + 40 = 100을 return 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #3</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">"10 Z 20 Z 1"에서 10 다음 Z, 20 다음 Z로 10, 20이 지워지고 1만 더하여 1을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges