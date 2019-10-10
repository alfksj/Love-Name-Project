import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ToolTipManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
	private static double VERSION_CODE = 1.0;
	private static JFrame fm = new JFrame("Love Name Project");
	private static JButton mod[] = new JButton[3];
	private static JTextField memory = new JTextField();
	private static JSONParser jps = new JSONParser();
	private static EtchedBorder bord = new EtchedBorder();
	private static class AutoGUI extends Thread {
		@Override
		public void run() {
			try {
				while(true) {
					//fm.setSize(fm.getWidth(),fm.getHeight());
					int c1=fm.getWidth(),c2=fm.getHeight();
					tit.setSize(c1,70);
					p.setSize(c1-100,c2-98-80);
					wait.setSize(p.getSize());load.setLocation((wait.getWidth()-50)/2,(wait.getHeight()-50)/2);
					for(int i=0;i<3;i++) {
						mod[i].setSize(c1/3,50);
						mod[i].setLocation(c1/3*i,c2-98);
					}
					if(sel==1) {
						memory.setSize(c1-900,50);
						sarc.setSize((p.getWidth()-memory.getWidth())/6,50);sarc
						.setLocation(memory.getX()+memory.getWidth(),memory.getY());
						add.setSize(sarc.getSize());add.setLocation(sarc.getX()+sarc.getWidth(),sarc.getY());
						del.setSize(add.getSize());del.setLocation(add.getX()+add.getWidth(),add.getY());
						rs.setSize(add.getSize());rs.setLocation(del.getX()+add.getWidth(),add.getY());
						sa.setSize(add.getSize());sa.setLocation(rs.getX()+add.getWidth(),add.getY());
						ld.setSize(add.getSize());ld.setLocation(sa.getX()+add.getWidth(),add.getY());
						show1.setLocation(0,sarc.getY()+sarc.getHeight()+5);
						for(int i=0;i<sp.length;i++) {
							spl[i].setSize(300,p.getHeight()-show1.getY()-show1.getHeight()-50);spl[i].setLocation(i*300+spI*i,show1.getY()+20+show1.getHeight()+5);
						}
					}
					if(sel==2) {
						hello.setLocation((p.getWidth()-hello.getWidth())/2,0);
						dbF.setLocation(p.getWidth()/91*2,100);fnd.setLocation(fp.getX()+fp.getWidth()-1,95);
						fp.setLocation(270-(40-dbF.getX()),95);fp.setSize(p.getWidth()/91*45,50);
						start.setLocation(((p.getWidth()-504)/2)+308,p.getHeight()-60);
						pre.setLocation(((p.getWidth()-504)/2),p.getHeight()-60);
						pg.setSize(p.getWidth()-200,30);pg.setLocation(100,pre.getY());
					}
					if(sel==3) {
						rtar.setSize(p.getWidth()*5/8-200,50);rtar.setLocation((p.getWidth()-rtar.getWidth())/2,(p.getHeight()-50)/2);
						fnds.setSize(200,50);fnds.setLocation(rtar.getX()+rtar.getWidth(),rtar.getY());
						rot.setSize(p.getWidth()-50,100);rot.setLocation(25,rtar.getY()-110);rot.setPreferredSize(rot.getSize());
						ldp.setLocation(p.getWidth()-250,p.getHeight()-70);selboard.setSize((int)(p.getWidth()/1.2)+20,p.getHeight()/2);selboard.setLocation(
						(p.getWidth()-selboard.getWidth())/2,200);afil.setSize((selboard.getWidth())/4,50);cls.setSize(afil.getSize());sear.setSize(cls.getSize());
						dis.setSize(cls.getSize());afil.setLocation(selboard.getX(),selboard.getY()+selboard.getHeight()+1);cls.setLocation(afil.getX()+afil.getWidth(),
						afil.getY());sear.setLocation(cls.getX()+cls.getWidth(),cls.getY());dis.setLocation(sear.getX()+cls.getWidth(),cls.getY());
						rut.setSize(50,50);rut.setLocation((p.getWidth()-50)/2,rtar.getY()+rtar.getHeight()+3);int noBor=(selboard.getWidth()-10)/30;
						typ.setSize(noBor*3,30);des.setSize(noBor*14,30);aval.setSize(noBor*8,30);av.setSize(noBor*4,30);clo.setSize(noBor+20,30);
						typ.setLocation(0,0);des.setLocation(typ.getWidth(),0);aval.setLocation(des.getX()+des.getWidth(),0);av.setLocation(aval.getX()+aval.getWidth(),0);
						clo.setLocation(av.getX()+av.getWidth(),0);Dimension c11=typ.getSize(),c12=des.getSize(),c13=aval.getSize(),c14=av.getSize();up.setLocation(afil.getX(),afil.getY()+100);
						int c21=typ.getX(),c22=des.getX(),c23=aval.getX(),c24=av.getX();down.setLocation(up.getX()+210,up.getY());sna.setLocation(down.getX()+210,up.getY());
						for(int i=0;i<sr.size();i++) {
							Rule r=sr.get(i);
							r.type.setSize(c11);r.name.setSize(c12);r.val.setSize(c13);r.adds.setSize(c14);r.x.setLocation(c24+c14.width+noBor/4,2);
							r.type.setLocation(c21,1);r.name.setLocation(c22,1);r.val.setLocation(c23,1);r.adds.setLocation(c24,1);
							r.root.setLocation(0,i*30+30);r.root.setSize(Filt.getWidth(),32);
						}//틀왜맞
						Filt.repaint();
						selboard.revalidate();
					}
					p.repaint();c.repaint();fm.repaint();
					Thread.sleep(2);
				}
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "UI 위치 계산 시스템이 "+e.getMessage()+" 오류로 인해 중지되었습니다.\n기술 정보 : \n"+Except.except(e),"UI Refresh Error",JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
	}
	private static Container c;
	private static Font tif=new Font("맑은 고딕", Font.PLAIN,50);
	private static Font std=new Font("맑은 고딕", Font.PLAIN,30);
	private static Font smr=new Font("맑은 고딕", Font.PLAIN,20);
	private static JPanel tit = null;
	private static Image ig=new ImageIcon("icon.png").getImage();
	private static Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
	private native int calc(int l1, int l2, int l3, int l4, int l5, int l6);
	public static void main(String[] args) {
		//System.out.println(IO.JNIIn("C:\\Users\\hyunc\\OneDrive\\바탕 화면\\as.json")); JNI IO Test
		@SuppressWarnings("unused")
		Main main = new Main();
		fm.setExtendedState(JFrame.MAXIMIZED_BOTH);fm.setSize(scr.width,scr.height);fm.setIconImage(ig);fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = fm.getContentPane();c.setBackground(Color.white);c.setLayout(null);p.setLocation(50,80);wait.setLocation(0,0);
		JLabel title = new JLabel("Love-Name-Project  <자동 계산 시스템>");title.setFont(new Font("맑은 고딕",Font.BOLD,40));
		tit = new JPanel(new FlowLayout(FlowLayout.CENTER));tit.add(title);tit.setBackground(Color.white);tit.setLocation(0,10);
		String tb[]={"계산","이름 DB 수정","결과 검색"};p.setBackground(Color.white);ToolTipManager ttm=ToolTipManager.sharedInstance();
		ttm.setLightWeightPopupEnabled(false);ttm.setDismissDelay(10000);load.setSize(50,50);wait.setLayout(null);wait.setBackground(Color.white);wait.add(load);
		for(int a=0;a<3;a++) {mod[a]=new JButton(tb[a]);mod[a].setFont(std);mod[a].setBackground(Color.white);c.add(mod[a]);}
		AutoGUI AG = new AutoGUI();AG.start();tit.repaint();c.add(tit);c.add(p);mod[1].addActionListener(new ndm());mod[0].addActionListener(new can());mod[2].addActionListener(new srm());
		c.repaint();fm.setVisible(true);
	}
	private static Hash hash = new Hash();
	private static int sel = -1,spI=-1;
	private static JPanel sp[] = null, rot=new JPanel();
	private static JTextField fp = new JTextField("");
	private static JScrollPane spl[] = null;
	private static File target=null;
	private static JTree dps = new JTree(new DefaultMutableTreeNode("RDPAA를 진행해야 정보를 볼 수 있습니다."));
	private static String code=null;
	private static boolean rpd=false,fet=false;
	private static JSONArray cach;
	private static JSONObject FileRoot,Data;
	private static ButtonGroup gtp = new ButtonGroup();
	private static JRadioButton hsm = new JRadioButton("100점 모드 사용"), ncsm = new JRadioButton("같은 이름끼리 계산하지 않기"), up=new JRadioButton("점수 오름차순 정렬"),down=new JRadioButton("점수 내림차순 정렬"),sna=new JRadioButton("계산되지 않은 동명자도 보여주기");
	private static JLabel show1 = new JLabel("Nothing is to show"),hello = new JLabel("LOVE-NAME-PROJECT : 계산 시스템"),dbF = new JLabel("이름 파일 위치 : "),rn=new JLabel("파일에 관한 정보를 보려면 RDPAA를 시행하세요."), load=new JLabel(new ImageIcon("load.gif")),
			selp = new JLabel("결과 파일 지정하기"), rut = new JLabel(new ImageIcon("load.gif")),typ = new JLabel("분류"), des = new JLabel("설명"), aval=new JLabel("데이터"), av = new JLabel("추가 분류"), clo=new JLabel("삭제");
	private static JTextField atir = new JTextField("100"),nosi=new JTextField("100"),rtar = new JTextField();
	private static JButton sarc=new JButton("검색"), add = new JButton("추가"), del = new JButton("삭제"), rs=new JButton("초기화"), sa=new JButton("저장"), ld=new JButton("로드"),fnd = new JButton("찾아보기"),start = new JButton("계산 시작"),pre=new JButton("RDPAA 진행"),
			fnds = new JButton("찾아보기"), ldp = new JButton("다음"), afil = new JButton("검색조건 추가"), cls=new JButton("조건 초기화"), sear=new JButton("검색"), dis=new JButton("결과 보기");
	private static JPanel p = new JPanel(),wait = new JPanel(),setting = new JPanel(),Filt=new JPanel();
	private static JProgressBar pg = new JProgressBar();
	private static JScrollPane RDPAA = new JScrollPane(dps),selboard=new JScrollPane(Filt);
	public static Vector<Rule> sr=new Vector<Rule>();
	private static abstract class Rule {
		public Rule(String tpy, String dep, String vInit, String[] addic) {
			root.setLayout(null);
			type=new JLabel(tpy);name=new JLabel(dep);adds=new JComboBox<String>(addic);val=new JTextField(vInit);
			type.setFont(smr);name.setFont(smr);val.setFont(smr);adds.setFont(smr);root.setBorder(bord);type.setBorder(bord);name.setBorder(bord);
			root.add(type);root.add(name);root.add(adds);root.add(val);x.setSize(25,25);root.add(x);x.setBorder(null);x.setBackground(new Color(0,0,0,0));
			selboard.getVerticalScrollBar().setValue(selboard.getVerticalScrollBar().getMaximum()+50);Date time = new Date();
			cert=hash.hash(new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(time.getTime())+Calendar.getInstance().get(Calendar.MILLISECOND),Hash.MD5);
			x.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					for(int i=0;i<sr.size();i++) {
						if(sr.get(i).cert.equals(cert)) {
							Rule r=sr.get(i);sr.remove(i);
							Filt.remove(r.root);
						}
					}
				}
			});
		}
		public String cert;
		public JLabel type, name;
		public abstract boolean Do(Task ans) throws Exception ;
		public JComboBox<String> adds;
		public JButton x = new JButton(new ImageIcon("delete.png"));
		public JTextField val;
		public JPanel root=new JPanel();
	}
	private static class NRule extends Rule {
		public NRule(String tpy, String dep) {	
			super(tpy,dep,"",new String[]{"왼쪽 이름과 같음","오른쪽 이름과 같음","둘 모두 같음","둘 중 하나 포함"});
		}
		@Override
		public boolean Do(Task ans) throws Exception  {
			String dat=val.getText();
			int selI=adds.getSelectedIndex();
			if(selI==0&&ans.n1.equals(dat)) return true;
			if(selI==1&&ans.n2.equals(dat)) return true;
			if(selI==2&&ans.n1.equals(dat)&&ans.n2.equals(dat)) return true;
			if(selI==3&&(ans.n1.equals(dat)||ans.n2.equals(dat))) return true;
			return false;
		}
	}
	private static class SRule extends Rule {
		public SRule(String tpy, String dep) {
			super(tpy, dep, "", new String[]{"같음","이상","이하","미만","초과"});
		}
		@Override
		public boolean Do(Task ans) throws Exception {
			int avl=Integer.parseInt(val.getText());
			int typr=adds.getSelectedIndex();
			if(typr==0&&ans.Answer==avl) return true;
			if(typr==1&&ans.Answer>=avl) return true;
			if(typr==2&&ans.Answer<=avl) return true;
			if(typr==3&&ans.Answer<avl) return true;
			if(typr==4&&ans.Answer>avl) return true;
			return false;
		}
	}
	private static class DRule extends Rule {
		public DRule() {
			super("기본","동명자 처리등을 처리하는 조건으로 삭제하거나 구성을 바꿀 수 없습니다.","",new String[]{});
			this.x.setEnabled(false);this.val.setEnabled(false);this.adds.setEnabled(false);
		}
		@Override
		public boolean Do(Task ans) {
			boolean sng=sna.isSelected();
			if(!sng&&ans.Answer==101) return false;
			return true;
		}
	}
	private static class srm implements ActionListener {
		private static JSONObject root,result,data;
		private static JSONArray meta;
		private static Vector<Task> ANS = new Vector<Task>();
		private void cls() {//반복시 홀수->2배수->4배수번만 지워지는 오류, 일단은 다 지워질때까지 지우기 단계 반복 하는 방법으로 해결
			do {
				for(int i=0;i<sr.size();i++) {
					Filt.remove(sr.get(i).root);
					sr.remove(i);
				}
			} while(sr.size()!=0);
			sr.add(new DRule());Filt.add(sr.get(0).root);
			up.setEnabled(false);down.setEnabled(false);
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			cls();rtar.setText("");
			ldp.setEnabled(true);rtar.setEnabled(true);fnds.setEnabled(true);p.remove(rut);
			mod[0].setEnabled(true);mod[1].setEnabled(true);mod[2].setEnabled(false);
			sel=3;p.removeAll();p.setLayout(null);p.setBorder(null);
			selp.setFont(tif);fnds.setBackground(Color.white);fnds.setFont(std);rtar.setFont(std);
			rot.setLayout(new FlowLayout(FlowLayout.CENTER));rot.setBackground(Color.white);
			selp.setSize(437,50);selp.setLocation((p.getWidth()-437)/2,0);
			ldp.setSize(200,50);ldp.setFont(std);ldp.setBackground(Color.white);
			up.setFont(smr);down.setFont(smr);up.setSize(200,30);down.setSize(200,30);sna.setFont(smr);sna.setSize(360,30);
			rot.add(selp);rot.repaint();
			if(!fet) {
				fet=!fet;
				rtar.addFocusListener(new FocusListener(){@Override public void focusGained(FocusEvent arg0){if(rtar.getText().equals("결과 파일 지정")) rtar.setText("");}@Override public void focusLost(FocusEvent arg0) {}});
				fnds.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						FileDialog sel = new FileDialog(fm,"결과 파일 지정하기",FileDialog.LOAD);
						sel.setVisible(true);
						if(sel.getDirectory()==null||sel.getFile()==null) return;
						rtar.setText(sel.getDirectory()+sel.getFile());
					}
				});
				cls.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						cls();
					}
				});
				ldp.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Thread t = new Thread() {
							@Override
							public void run() {
								p.add(rut);
								ldp.setEnabled(false);rtar.setEnabled(false);fnds.setEnabled(false);
								try {
									String sd=IO.in(rtar.getText());
									root = (JSONObject) jps.parse(sd);
									result=(JSONObject) root.get("result");
									meta = (JSONArray ) root.get("meta");
									data = (JSONObject) root.get("data");
									String has=hash.hash(result.toJSONString()+data.toJSONString()+meta.toJSONString(),Hash.SHA256);
									if(!has.equals(root.get("hash"))) throw new Exception("Hash test failure-Hash vaule mismatch");
									if(!AES256.decryptAES256((String)root.get("Sign"), Double.toString(VERSION_CODE)).equals(has)) throw new Exception("Cannot check sign value. Check your software version and retry.");
									boolean tst=true;
									for(int i=0;i<meta.size();i++) {
									JSONArray g=(JSONArray)result.get(meta.get(i));
									if(g==null) {tst=false;break;}
									}
									if(!tst) throw new Exception("Metadata and real data mismatch");
									p.removeAll();gtp.add(up);gtp.add(down);up.setSelected(true);ANS.clear();
									selboard.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
									selboard.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
									JLabel title = new JLabel("데이터 검색");title.setLocation(0,0);title.setSize(400,100);title.setFont(tif);
									p.setBorder(bord);selboard.setBorder(bord);Filt.setBackground(Color.white);
									afil.setFont(std);cls.setFont(std);sear.setFont(std);dis.setFont(std);
									afil.setBackground(Color.white);cls.setBackground(Color.white);sear.setBackground(Color.white);dis.setBackground(Color.white);
									typ.setFont(smr);des.setFont(smr);aval.setFont(smr);av.setFont(smr);typ.setBorder(bord);des.setBorder(bord);aval.setBorder(bord);av.setBorder(bord);clo.setFont(smr);clo.setBorder(bord);
									up.setBackground(Color.white);down.setBackground(Color.white);sna.setBackground(Color.white);
									p.add(up);p.add(down);p.add(sna);p.add(title);p.add(selboard);p.add(afil);p.add(cls);p.add(dis);p.add(sear);Filt.setLayout(null);
									Filt.add(typ);Filt.add(des);Filt.add(aval);Filt.add(av);Filt.add(clo);
								} catch (Exception e1) {
										JOptionPane.showMessageDialog(p, "열 수 없습니다.\n기술 정보 :\n"+Except.except(e1),"열기 실패",JOptionPane.ERROR_MESSAGE);
										ldp.setEnabled(true);rtar.setEnabled(true);fnds.setEnabled(true);p.remove(rut);
									}
									return;
								}
							};
							t.start();
						}
					});
				afil.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if(sr.size()==100) JOptionPane.showMessageDialog(p, "조건은 100개까지만 추가할 수 있습니다.","한계 도달",JOptionPane.WARNING_MESSAGE);
						JPanel tos = new JPanel();
						tos.setLayout(new FlowLayout(FlowLayout.CENTER));
						JRadioButton name = new JRadioButton("이름 기준 필터"), sco = new JRadioButton("점수 기준 필터");
						ButtonGroup bg = new ButtonGroup();bg.add(name);bg.add(sco);
						name.setSelected(true);name.setFont(smr);sco.setFont(smr);
						tos.add(name);tos.add(sco);
						int q=JOptionPane.showOptionDialog(p, tos, "새 기준 추가하기", JOptionPane.OK_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, null, null);
						if(q==JOptionPane.CANCEL_OPTION) return;
						Filt.setPreferredSize(new Dimension(Filt.getWidth(),(sr.size()+1)*30+32));
						if(name.isSelected()) {
							sr.add(new NRule("이름","이름을 기준으로 한 비교조건을 추가합니다."));
							Filt.add(sr.get(sr.size()-1).root);
							up.setEnabled(false);down.setEnabled(false);
						} else if(sco.isSelected()) {
							sr.add(new SRule("점수","점수를 기준으로 한 비교조건을 추가합니다."));
							Filt.add(sr.get(sr.size()-1).root);
							up.setEnabled(false);down.setEnabled(false);
						}
					}
				});
				sear.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int q=JOptionPane.showConfirmDialog(p, "검색을 시작할까요?\n조건의 갯수와 결과의 갯수에 따라 시간이 걸릴 수도 있습니다.","검색시작",JOptionPane.YES_NO_OPTION);
						if(q==JOptionPane.YES_OPTION) {
							c.remove(p);for(JButton j : mod) {c.remove(j);}c.remove(tit);
							JLabel wit = new JLabel(new ImageIcon("load.gif")), st = new JLabel("검색중"), now=new JLabel("스레드 응답 대기중");st.setFont(std);
							now.setSize(c.getWidth(),30);now.setFont(std);now.setLocation(0,c.getHeight()-40);c.add(now);
							wit.setSize(50,50);wit.setLocation((c.getWidth()-50)/2,c.getHeight()/2);st.setSize(5000,50);st.setLocation(wit.getX()-20,wit.getY()+55);
							c.add(wit);c.add(st);
							Thread calc = new Thread() {
								@Override
								public void run() {
									try {
										now.setText("초기화중");
										ANS.clear();
										now.setText("결과 파일 데이터 정리-객체화중");
										Vector<Task> res = new Vector<Task>();
										for(int i=0;i<meta.size();i++) {
											JSONArray ar = (JSONArray) result.get(meta.get(i));
											Task q = new Task((String)ar.get(0),(String)ar.get(1));
											for(int j=0;j<5;j++) {
												int rdP=0,lR=0,iN=0;String rS=((String) ar.get(j+2))+' ';
												while(true) {
													if(rS.charAt(rdP)==' ') {
														int n=Integer.parseInt(rS.substring(lR,rdP));
														switch(j) {
														case 0:
															q.step1[iN]=n;
															break;
														case 1:
															q.step2[iN]=n;
															break;
														case 2:
															q.step3[iN]=n;
															break;
														case 3:
															q.step4[iN]=n;
															break;
														case 4:
															q.step5[iN]=n;
															break;
														}
														iN++;
														lR=rdP+1;
													}
													rdP++;
													if(rdP==rS.length()) break;
												}
											}
											q.Answer=new Long((long) ar.get(7)).intValue();
											res.add(q);
										}
										now.setText("기준에 따라 검색중");
										Vector<Task> temp = new Vector<Task>();
										for(int i=0;i<sr.size();i++) {
											Rule r= sr.get(i);
											for(int j=0;j<res.size();j++) {
												if(r.Do(res.get(j))) {
													temp.add(res.get(j));
												}
											}
											res.clear();temp.forEach((con)->res.add(con));
											temp.clear();
										}
										now.setText("결과 복사중");
										res.forEach((con)->ANS.add(con));
										c.remove(wit);c.remove(st);c.remove(now);up.setEnabled(true);down.setEnabled(true);
									} catch (Exception e) {
										now.setText(e.getMessage());
										JOptionPane.showMessageDialog(p,"검색할 수 없습니다.\n기술 정보 : "+Except.except(e),"검색 실패",JOptionPane.ERROR_MESSAGE);
									} finally {
										c.add(p);for(JButton j : mod) {c.add(j);}c.add(tit);
									}
								}
							};
							calc.start();
						}
					}
				});
				dis.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						dataR.removeAll();
						JFrame as = new JFrame();as.setResizable(false);as.setIconImage(ig);
						Container c = as.getContentPane();c.setLayout(null);
						as.setTitle("검색 결과");as.setSize(1000,600);as.setLocation(200,200);
						JPanel spe = new JPanel(); spe.setBackground(Color.white);spe.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
						JScrollPane lst = new JScrollPane(spe);lst.setLocation(0,0);
						dataR.setBackground(Color.white);dataR.setLayout(null);
						lst.setBorder(bord);dataR.setBorder(bord);c.add(lst);c.add(dataR);
						Vector<JButton> bs = new Vector<JButton>();
						JButton ser = new JButton("개요");ser.setFont(std);ser.setBackground(Color.white);
						JLabel til=new JLabel((String)data.get("name"));JTextArea ar = new JTextArea(
								"계산 결과파일 시스템 정보"
								+ "\n   계산자 : "+data.get("calcBy")
								+ "\n   계산 OS : "+data.get("OS")
								+ "\n   계산시 사용된 Java 버전 : "+data.get("javaVer")
								+ "\n   해시값 : "+root.get("hash")
								+ "\n   추가키 : "+root.get("Sign")
								+ "\n   계산에 사용된 이름 데이터베이스 제작 시각 : "+data.get("nameDBTimeStamp")
								+ "\n   계산 파일 제작 시각 : "+data.get("TimeStamp")
								+ "\n계산 결과파일 일반 정보"
								+ "\n   계산한 명수 : "+new Double(Math.sqrt(meta.size())).intValue()
								+ "\n   계산 결과 갯수 : "+meta.size()
						);
						JScrollPane overv = new JScrollPane(ar);
						ser.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								dataR.removeAll();
								til.setFont(tif);til.setLocation(10,10);dataR.add(til);ar.setBackground(Color.white);ar.setEditable(false);
								ar.setSize(1,1);ar.setLocation(0,0);ar.setFont(smr);overv.setLocation(10,100);dataR.add(overv);
							}
						});
						bs.add(ser);spe.add(ser);
						if(up.isSelected()) {
							Collections.sort(ANS,new upc());
						} else {
							Collections.sort(ANS,new downc());
						}
						for(int i=0;i<ANS.size();i++) {
							JButton ade=new JButton(ANS.get(i).n1+'-'+ANS.get(i).n2);ade.setFont(std);
							ade.setBackground(Color.white);ade.addActionListener(new btnS(i));
							bs.add(ade);spe.add(bs.get(i+1));
						}
						lst.setSize(300,600);dataR.setSize(700,600);dataR.setLocation(300,0);
						spe.setPreferredSize(new Dimension(spe.getWidth(),new Double((ANS.size())*35.1).intValue()));
						int c2=as.getHeight();
						for(int i=0;i<bs.size();i++) {
							JButton modify=bs.get(i);
							modify.setPreferredSize(new Dimension(300,35));modify.setLocation(0,i*35);
							dataR.repaint();
						}overv.setSize(dataR.getWidth()-20,c2-150);
						if(!r) {
							r=!r;
							Thread mgr = new Thread() {
								@Override
								public void run() {
									while(true) {
										dataR.repaint();
									}
								}
							};
							mgr.start();
						}
						til.setSize(dataR.getWidth()-10,50);
						as.setVisible(true);
					}
				});
			}
			p.add(rtar);p.add(fnds);p.add(rot);p.add(ldp);p.repaint();
			}
			private boolean r=false;
			private class upc implements Comparator<Task> {
				@Override
				public int compare(Task arg0, Task arg1) {
					return arg1.Answer-arg0.Answer;
				}
			}
			private class downc implements Comparator<Task> {
				@Override
				public int compare(Task arg0, Task arg1) {
					return arg0.Answer-arg1.Answer;
				}
			}
			static JPanel dataR = new JPanel();
			private static class btnS implements ActionListener {
				private Task q;
				public btnS(int who) {
					q=ANS.get(who);
				}
				@Override
				public void actionPerformed(ActionEvent e) {
					dataR.removeAll();
					JLabel nameI = new JLabel(q.n1+" with "+q.n2),l1=new JLabel(q.step1[0]%10+" "+q.step1[1]%10+" "+q.step1[2]%10+" "+q.step1[3]%10+" "+q.step1[4]%10+" "+q.step1[5]%10),
							l2=new JLabel(q.step2[0]+" "+q.step2[1]+" "+q.step2[2]+" "+q.step2[3]+" "+q.step2[4]),l3=new JLabel(q.step3[0]+" "+q.step3[1]+" "+q.step3[2]+" "+q.step3[3]),
							l4=new JLabel(q.step4[0]+" "+q.step4[1]+" "+q.step4[2]),l5=new JLabel(q.step5[0]%10+" "+q.step5[1]),les=new JLabel(q.Answer!=101?Integer.toString(q.Answer)+'%':"동명자"),ar=new JLabel(new ImageIcon("arrow.png"));
					l1.setSize(200,30);l2.setSize(200,30);l3.setSize(200,30);l4.setSize(200,30);l5.setSize(200,30);les.setFont(new Font("맑은 고딕",Font.BOLD,100));
					final int stX=100,NI=15;l1.setLocation(stX,65);l2.setLocation(stX+NI,95);l3.setLocation(stX+NI*2,125);ar.setSize(40,40);
					les.setForeground(Color.getHSBColor(250-q.Answer/2,240,120));dataR.add(les);
					l4.setLocation(stX+NI*3,155);l5.setLocation(stX+NI*4,185);ar.setLocation(l5.getX(),l5.getY()+l5.getHeight());
					nameI.setSize(500,50);nameI.setLocation(0,0);nameI.setForeground(new Color(255,180,200));
					nameI.setFont(tif);l1.setFont(std);l2.setFont(std);l3.setFont(std);l4.setFont(std);l5.setFont(std);
					les.setLocation(l5.getX()-95,ar.getY()+42);les.setSize(400,130);
					dataR.add(nameI);dataR.add(l1);dataR.add(l2);dataR.add(l3);dataR.add(l4);dataR.add(l5);dataR.add(ar);
				}
			}
		}
	private static boolean pri=false,prs=false;
	private static class can implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				mod[0].setEnabled(false);mod[1].setEnabled(true);mod[2].setEnabled(true);
				sel=2;p.removeAll();p.setBorder(bord);p.setLayout(null);
				dps.setPreferredSize(new Dimension(270,400));
				hsm.setToolTipText("마지막 줄(L4->L5)에서 1, 2번의 합이 10이며 2, 3번의 합이 0이거나 10 이상인 경우 0점이 아닌 100점으로 취급합니다.");
				ncsm.setToolTipText("두 이름이 같은 경우 계산을 하지 않고 동명자 미계산처리합니다.");
				dps.setRowHeight(20);hsm.setFont(smr);ncsm.setFont(smr);
				pre.setFont(std);pre.setSize(300,50);dps.setSize(300,400);dps.setLocation(0,0);rn.setFont(smr);rn.setForeground(Color.GRAY);
				atir.setFont(smr);atir.setPreferredSize(new Dimension(100,40));nosi.setPreferredSize(new Dimension(100,40));
				if(!prs) {
					prs=!prs;
					fnd.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							FileDialog fd = new FileDialog(fm,"이름 파일 지정하기",FileDialog.LOAD);
							fd.setDirectory(System.getProperty("user.home"));fd.setIconImage(ig);
							fd.setVisible(true);
							try {
								if(fd.getDirectory()==null) return;
								fp.setText(fd.getDirectory()+fd.getFile());
								if(!rpd) return;
								rpd=false;
								dps.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("RDPAA를 진행해야 정보를 볼 수 있습니다.")));
								dps.setPreferredSize(new Dimension(270,300));
							}catch(Exception e1) {
								JOptionPane.showMessageDialog(p, "읽지 못했습니다.\n기술 코드 : \n"+Except.except(e1), e1.getMessage(), JOptionPane.ERROR_MESSAGE);
								return;
							}
						}
					});
					pre.addActionListener(new ActionListener() {
						@SuppressWarnings("unchecked")
						@Override
						public void actionPerformed(ActionEvent e) {
							p.add(wait);
							Thread che = new Thread() {
								public void run() {
									try {
										target=new File(fp.getText());
										code=IO.in(fp.getText());
										if(DPT(code)) {
											int l=4;
											FileRoot=(JSONObject)jps.parse(code);
											Data=(JSONObject)FileRoot.get("Data");
											DefaultMutableTreeNode secu = new DefaultMutableTreeNode("보안 정보"),
															   	root = new DefaultMutableTreeNode(Data.get("Name")),
															   	db   = new DefaultMutableTreeNode("데이터 목록"),
															   	dat  = new DefaultMutableTreeNode("파일 데이터");
											JSONArray ar = (JSONArray)Data.get("DataBase");
											ar.forEach((dap)->db.add(new DefaultMutableTreeNode(dap)));
											l+=ar.size();l+=6;
											String sig=(String)FileRoot.get("Sign");
											secu.add(new DefaultMutableTreeNode("지문 : "+FileRoot.get("FingerPrint")));
											secu.add(new DefaultMutableTreeNode("인증키 : "+sig));
											dat.add(new DefaultMutableTreeNode("제작 버전 : "+Data.get("MakeVers")));
											dat.add(new DefaultMutableTreeNode("타임스탬프 : "+Data.get("TimeStamp")));
											dps.setPreferredSize(new Dimension(sig.length()*6+300,l*20));
											root.add(dat);root.add(secu);root.add(db);
											DefaultTreeModel mod=new DefaultTreeModel(root);
											dps.setModel(mod);
											rpd=true;
											cach=ar;
										} else {
											p.remove(wait);
											return;
										}
										p.remove(wait);
									} catch(Exception e1) {
										JOptionPane.showMessageDialog(c, "파일 분석 실패\n"+e1.getMessage(),"올바르지 않은 파일",JOptionPane.ERROR_MESSAGE);
										p.remove(wait);
										return;
									}}};che.start();}});
						start.addActionListener(new starter());
						fp.addKeyListener(new KeyListener() {
						@Override
						public void keyPressed(KeyEvent arg0) {
							if(!rpd) return;
							rpd=false;
							dps.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("RDPAA를 진행해야 정보를 볼 수 있습니다.")));
							dps.setPreferredSize(new Dimension(270,300));
						}
						@Override
						public void keyReleased(KeyEvent arg0) {}
						@Override
						public void keyTyped(KeyEvent arg0) {}
					});
				}
				dbF.setSize(240,30);
				hello.setSize(850,80);hello.setFont(tif);p.add(hello);
				fnd.setSize(150,50);fnd.setBackground(Color.white);fnd.setFont(smr);
				dbF.setFont(std);fp.setFont(std);nosi.setFont(smr);pre.setBackground(Color.white);
				RDPAA.setBorder(new TitledBorder("Raw Data Parse And Analysis"));
				setting.setBorder(new TitledBorder("설정"));setting.setSize(700,100);setting.setLocation(10,170);
				pg.setForeground(Color.green);pg.setBackground(Color.GRAY);
				hsm.setBackground(Color.white);ncsm.setBackground(Color.white);setting.add(hsm);setting.add(ncsm);
				RDPAA.setLocation(715,170);RDPAA.setSize(300,400);RDPAA.setBackground(Color.white);RDPAA.add(rn);
				start.setFont(std);start.setSize(200,50);start.setBackground(Color.white);
				setting.setBackground(Color.white);setting.setLayout(new FlowLayout(FlowLayout.LEFT));
				p.add(start);p.add(pre);p.add(RDPAA);
				p.add(dbF);p.add(fp);p.add(fnd);p.add(setting);
			}
		private class starter implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!rpd) JOptionPane.showMessageDialog(p, "먼저 RDPAA를 진행하세요.", "RDPAA-NullPointer", JOptionPane.WARNING_MESSAGE); 
				int qx=JOptionPane.showConfirmDialog(p, cach.size()+"명에 대한 이름궁합 계산을 시작합니까?", "계산 시작",JOptionPane.YES_NO_OPTION);
				if(qx==JOptionPane.NO_OPTION) return;
				p.remove(pre);p.remove(start);p.add(pg);fp.setEnabled(false);fnd.setEnabled(false);ncsm.setEnabled(false);hsm.setEnabled(false);mod[1].setEnabled(false);mod[2].setEnabled(false);
				Vector<Task> res = new Vector<Task>();
				Thread r = new Thread() {
					@SuppressWarnings("unchecked")
					@Override
					public void run() {
						boolean q=ncsm.isSelected();
						boolean x=hsm.isSelected();
						int vals=cach.size();
						pg.setMinimum(0);pg.setMaximum(vals*vals);pg.setValue(0);
						for(int i=0;i<vals;i++) {
							for(int j=0;j<vals;j++) {
								Task tar=new Task((String)cach.get(i),(String)cach.get(j));
								if(tar.n1.contentEquals(tar.n2)&&q) {
									tar.Answer=101;tar.step1= new int[]{0,0,0,0,0,0};tar.step2= new int[]{0,0,0,0,0};
									tar.step3= new int[]{0,0,0,0};tar.step4= new int[]{0,0,0};tar.step5= new int[]{0,0};
									res.add(tar);
								} else {
									tar.step1=new int[]{divideHangul(tar.n1.charAt(0)),divideHangul(tar.n2.charAt(0)),divideHangul(tar.n1.charAt(1)),divideHangul(tar.n2.charAt(1)),divideHangul(tar.n1.charAt(2)),divideHangul(tar.n2.charAt(2))};
									for(int k=0;k<5; k++) {tar.step2[k]=(tar.step1[k]+tar.step1[k+1])%10;}
									for(int k=0;k<4; k++) {tar.step3[k]=(tar.step2[k]+tar.step2[k+1])%10;}
									for(int k=0;k<3; k++) {tar.step4[k]=(tar.step3[k]+tar.step3[k+1])%10;}
									for(int k=0;k<2; k++) {
										if(x) {
											if(tar.step4[0]+tar.step4[1]==10&&(tar.step4[1]+tar.step4[2])%10==0) {
												tar.step5[0]=10;tar.step5[1]=0;
											} else {
												tar.step5[k]=(tar.step4[k]+tar.step4[k+1])%10;
											}
										} else {
											tar.step5[k]=(tar.step4[k]+tar.step4[k+1])%10;
										}
									}
									tar.Answer=tar.step5[0]*10+tar.step5[1];
									res.add(tar);
								}
								pg.setValue(pg.getValue()+1);
							}
						}
						p.remove(pg);p.add(pre);p.add(start);
						FileDialog saveTo = new FileDialog(fm,"저장 위치 지정",FileDialog.SAVE);
						saveTo.setVisible(true);saveTo.setIconImage(ig);
						if(saveTo.getDirectory()==null||saveTo.getFile()==null) {
							fp.setEnabled(true);fnd.setEnabled(true);ncsm.setEnabled(true);hsm.setEnabled(true);mod[1].setEnabled(true);mod[2].setEnabled(true);
							return;

						}
						c.remove(p);
						JPanel q2=new JPanel(),sta=new JPanel();
						q2.setSize(p.getSize());q2.setLocation(p.getLocation());q2.setBackground(Color.white);q2.setLayout(null);
						sta.setSize(q2.getWidth(),40);sta.setLocation(0,q2.getHeight()*4/9+55);sta.setLayout(new FlowLayout(FlowLayout.CENTER));sta.setBackground(Color.white);;
						JLabel til = new JLabel("저장중입니다"), sus = new JLabel("UI 구성중");til.setFont(tif);til.setSize(300,50);til.setLocation((q2.getWidth()-300)/2,q2.getHeight()*4/9);
						sta.add(sus);q2.add(sta);q2.add(til);c.add(q2);c.repaint();q2.repaint();sus.setFont(std);
						Thread out = new Thread() {
							@Override
							public void run() {
								sus.setText("경로 분석중");
								StringBuffer d=new StringBuffer(saveTo.getDirectory()+"\\"+saveTo.getFile());
								if(!d.substring(d.length()-5,d.length()).equals(".json")) {
									d.append(".json");
								}
								sus.setText("내부 속성 초기화중");
								rpd=false;
								sus.setText("JSON 구성중");
								JSONObject root = new JSONObject();
								JSONArray meta = new JSONArray();
								JSONObject result = new JSONObject(), sec=new JSONObject();
								for(int i=0;i<vals;i++) {for(int j=0;j<vals;j++) {meta.add(cach.get(i)+"-"+cach.get(j));}}
								for(int kx=0;kx<res.size();kx++) {
									JSONArray que = new JSONArray();
									Task q1=res.get(kx);
									que.add(q1.n1);que.add(q1.n2);que.add(q1.step1[0]+" "+q1.step1[1]+" "+q1.step1[2]+" "+q1.step1[3]+" "+q1.step1[4]+" "+q1.step1[5]);que.add(q1.step2[0]+" "+q1.step2[1]+" "+q1.step2[2]+" "+q1.step2[3]+" "+q1.step2[4]);
									que.add(q1.step3[0]+" "+q1.step3[1]+" "+q1.step3[2]+" "+q1.step3[3]);que.add(q1.step4[0]+" "+q1.step4[1]+" "+q1.step4[2]);que.add(q1.step5[0]+" "+q1.step5[1]);
									que.add(q1.Answer);
									result.put(q1.n1+"-"+q1.n2,que);
								}
								try{
									sec.put("name",Data.get("Name"));sec.put("nameDBTimeStamp",Data.get("TimeStamp"));Calendar cal = Calendar.getInstance();
									sec.put("TimeStamp",cal.get(Calendar.YEAR)+"."+(cal.get(Calendar.MONTH)+1)+"."+cal.get(Calendar.DAY_OF_MONTH)+"\\"+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
									sec.put("calcBy",System.getProperty("user.name"));sec.put("OS",System.getProperty("os.name")+"("+System.getProperty("os.version")+")"+"/"+System.getProperty("os.arch"));sec.put("javaVer",System.getProperty("java.version"));
									root.put("hash",hash.hash(result.toJSONString()+sec.toJSONString()+meta.toJSONString(),Hash.SHA256));
									root.put("Sign",AES256.encryptAES256((String)root.get("hash"),Double.toString(VERSION_CODE)));
									root.put("meta", meta);root.put("result",result);root.put("data",sec);
									sus.setText("쓰는 중");
									IO.out(d.toString(), root.toJSONString());} catch(Exception e) {
									JOptionPane.showMessageDialog(p, "저장할 수 없습니다.\n기술 정보 : \n"+Except.except(e),"저장 실패", JOptionPane.ERROR_MESSAGE);
									sus.setText("실패");
									try{Thread.sleep(3000);}catch(Exception e2) {}
									c.remove(q2);c.add(p);fp.setEnabled(true);fnd.setEnabled(true);ncsm.setEnabled(true);hsm.setEnabled(true);mod[1].setEnabled(true);mod[2].setEnabled(true);
								}
								sus.setText("완료");
								try{Thread.sleep(3000);}catch(Exception e2) {}
								c.remove(q2);c.add(p);fp.setEnabled(true);fnd.setEnabled(true);ncsm.setEnabled(true);hsm.setEnabled(true);mod[1].setEnabled(true);mod[2].setEnabled(true);
							}
						};
						out.start();
					}
				};
				r.start();
			}
		}
		private static char[] arrChoSung  = {0x3131, 0x3132, 0x3134, 0x3137, 0x3138, 0x3139, 0x3141,
				 0x3142, 0x3143, 0x3145, 0x3146, 0x3147, 0x3148, 0x3149,
				 0x314a, 0x314b, 0x314c, 0x314d, 0x314e};
		private static char[] arrJungSung = {0x314f, 0x3150, 0x3151, 0x3152, 0x3153, 0x3154, 0x3155,
				 0x3156, 0x3157, 0x3158, 0x3159, 0x315a, 0x315b, 0x315c,
				 0x315d, 0x315e, 0x315f, 0x3160, 0x3161, 0x3162, 0x3163};
		private static char[] arrJongSung = {0x0000, 0x3131, 0x3132, 0x3133, 0x3134, 0x3135, 0x3136,
				 0x3137, 0x3139, 0x313a, 0x313b, 0x313c, 0x313d, 0x313e,
				 0x313f, 0x3140, 0x3141, 0x3142, 0x3144, 0x3145, 0x3146,
				 0x3147, 0x3148, 0x314a, 0x314b, 0x314c, 0x314d, 0x314e};
		private int TimeDB(char letter) {
			switch(letter) {
				case 'ㄱ': return 2;case 'ㄴ': return 2;case 'ㄷ': return 3;case 'ㄹ': return 5;case 'ㅁ': return 4;case 'ㅂ': return 4;
				case 'ㅅ': return 2;case 'ㅇ': return 1;case 'ㅈ': return 3;case 'ㅊ': return 4;case 'ㅋ': return 3;case 'ㅍ': return 4;
				case 'ㅌ': return 4;case 'ㅎ': return 3;case 'ㄲ': return 4;case 'ㄸ': return 6;case 'ㅆ': return 4;case 'ㅃ': return 8;
				case 'ㅉ': return 6;case 'ㅏ': return 2;case 'ㅐ': return 3;case 'ㅑ': return 3;case 'ㅒ': return 4;case 'ㅓ': return 2;
				case 'ㅔ': return 3;case 'ㅗ': return 2;case 'ㅘ': return 4;case 'ㅙ': return 5;case 'ㅚ': return 3;case 'ㅛ': return 3;
				case 'ㅜ': return 2;case 'ㅝ': return 4;case 'ㅠ': return 3;case 'ㅡ': return 1;case 'ㅢ': return 2;case 'ㅣ': return 1;
				case 'ㅞ': return 5;case 'ㅟ': return 3;case 'ㅕ': return 3;case 'ㅖ': return 4;case 'ㄳ': return 4;case 'ㄵ': return 5;
				case 'ㄶ': return 5;case 'ㄺ': return 7;case 'ㄻ': return 9;case 'ㄼ': return 9;case 'ㄽ': return 7;case 'ㄾ': return 9;
				case 'ㅀ': return 8;case 'ㅄ': return 6;
				default:
					return 0x0000;
			}
		}
		private int divideHangul(char name) {
			int result=0;
			char chars = (char) (name - 0xAC00);
			if (chars >= 0 && chars <= 11172) {
				int chosung 	= chars / (21 * 28);
				int jungsung 	= chars % (21 * 28) / 28;
				int jongsung 	= chars % (21 * 28) % 28;
				result += (TimeDB(arrChoSung[chosung]) + TimeDB(arrJungSung[jungsung]));
				if (jongsung != 0x0000) {
					result += TimeDB(arrJongSung[jongsung]);
				}
			} else {
				return -1;
			}
			return result;
		}
	}
	private static class ndm implements ActionListener {
		private class meta {
			public int TableAddr,serial;
			public String data;
			public meta(int TableAddr, int serial, String data) {
				this.TableAddr=TableAddr;this.serial=serial;this.data=data;
			}
		}
		public Vector<meta> db = new Vector<meta>();
		public Vector<JLabel> dbL = new Vector<JLabel>();
		@Override
		public void actionPerformed(ActionEvent e) { 
			mod[0].setEnabled(true);mod[1].setEnabled(false);mod[2].setEnabled(true);
			p.removeAll();p.setLayout(null);p.setBorder(null);
			memory.setLocation(0,0);p.add(memory);memory.setFont(std);sarc.setFont(std);sarc.setBackground(Color.white);p.add(sarc);
			add.setFont(std);add.setBackground(Color.white);p.add(add);show1.setFont(new Font("맑은 고딕",Font.PLAIN,23));show1.setSize(scr.width-100,35);
			del.setFont(std);del.setBackground(Color.white);p.add(del);rs.setFont(std);rs.setBackground(Color.white);p.add(rs);
			sa.setFont(std);sa.setBackground(Color.white);p.add(sa);ld.setFont(std);ld.setBackground(Color.white);p.add(ld);
			if(sp==null) {
				int avlSP=p.getWidth();
				final int tis=(avlSP-avlSP%300)/300;
				spl=new JScrollPane[tis];
				sp=new JPanel[tis];
				spI=(avlSP-sp.length*300)/sp.length-1;
				for(int i=0;i<sp.length;i++) {
					sp[i]=new JPanel();
					spl[i]=new JScrollPane(sp[i]);
					sp[i].setBackground(new Color(230,230,230));sp[i].setLayout(null);sp[i].setLocation(0,0);
				}
				sarc.addActionListener(new src());rs.addActionListener(new cls());ld.addActionListener(new load());
				memory.addKeyListener(new shortcut());
			}add.addActionListener(new adb());del.addActionListener(new dec());sa.addActionListener(new savet());
			for(int i=0;i<spl.length;i++) {
				sp[i].setSize(280,0);sp[i].setLocation(0,0);sp[i].setBorder(bord);
				sp[i].setLayout(null);
				p.add(spl[i]);
			}
			p.add(show1);
			sel=1;
			p.repaint();
		}
		private class shortcut implements KeyListener {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_CONTROL) {
					if(memory.getText().equals("")) {show1.setText("이름을 입력해야 추가할 수 있습니다.");show1.setForeground(Color.red);}
					lT++;
					if(lT==td.length) {lT=0;}
					db.add(new meta(lT,td[lT]+1,memory.getText()));
					add(lT,memory.getText());td[lT]++;memory.setText("");
					show1.setText((lT+1)+"번 테이블 "+td[lT]+"번에 이름이 추가되었습니다.");show1.setForeground(Color.green);
				}
				if(e.getKeyCode()==KeyEvent.VK_ALT) {
					show1.setText("검색중......");show1.setForeground(Color.orange);
					if(db.size()==0) {
						show1.setText("등록되지 않은 이름입니다.");show1.setForeground(Color.green);
					} else {
						String cache=memory.getText();
						StringBuffer tos = new StringBuffer();
						int vnt=0;
						for(int i=0;i<db.size();i++) {
							if(db.elementAt(i).data.equals(cache)) {
								meta q=db.elementAt(i);
								tos.append(q.TableAddr+1+"번 테이블의 "+q.serial+"번 ");vnt++;
							}
						}
						if(vnt==0) {
							show1.setText("등록되지 않은 이름입니다.");show1.setForeground(Color.green);
						} else {
							tos.append("총 "+vnt+"번 겹칩니다.");
							show1.setText(tos.toString());show1.setForeground(Color.red);
						}
					}
				}
				if(e.getKeyCode()==KeyEvent.VK_ALT) {

				}
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		}
		private class savet implements ActionListener {
			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fs =null;
				fs= new FileDialog(fm,"저장 위치 선택",FileDialog.SAVE);fs.setIconImage(ig);
				fs.setDirectory(System.getProperty("user.home"));fs.setVisible(true);
				StringBuffer f = new StringBuffer(fs.getDirectory()+"\\"+fs.getFile());
				if(!f.toString().endsWith(".json")) {
					f.append(".json");
				}
				String nam=JOptionPane.showInputDialog(c,"이름 목록 파일의 이름 정하기","저장",JOptionPane.DEFAULT_OPTION);
				String tar=f.toString();
				JSONObject root = new JSONObject();
				JSONObject Data = new JSONObject();
				JSONArray ja = new JSONArray();
				for(int i=0;i<db.size();i++) {
					ja.add(db.elementAt(i).data);
				}
				try {
					Data.put("MakeVers",VERSION_CODE);
					Calendar cal = Calendar.getInstance();
					Data.put("TimeStamp",cal.get(Calendar.YEAR)+"."+(cal.get(Calendar.MONTH)+1)+"."+cal.get(Calendar.DAY_OF_MONTH)+"\\"+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
					root.put("Sign",AES256.encryptAES256(Data.toJSONString(), hash.hash(nam, Hash.SHA384)));
					Data.put("Name", nam);
					Data.put("DataBase", ja);
					root.put("FingerPrint",hash.hash(Data.toJSONString(), Hash.SHA512));
					root.put("Data",Data);
					if(fs.getDirectory()==null||fs.getFile()==null) return;
					IO.out(tar, root.toJSONString());
					show1.setText("저장하였습니다.");
					show1.setForeground(Color.green);
				} catch (Exception e1) {
					show1.setText("저장하지 못했습니다.\n기술 코드:\n"+Except.except(e1));show1.setForeground(Color.red);
				}
			}
		}
		private class load implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				int qz;
				if(td[0]!=0) {
					String[] q = {"기존 데이터와 병합", "기존 데이터를 모두 지우고 불러오기", "취소"};
					qz=JOptionPane.showOptionDialog(c, "로드 후 기존 테이블에 있던 데이터는 어떻게 할까요?", "기존 데이터 충돌", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, q, q[0]);
					if(qz==2) return;
					if(qz==1) {
						for(int j=0;j<td.length;j++) td[j]=0;
						UIReset();
						lT=sp.length-1;db.clear();dbL.clear();
					}
				}
				FileDialog sw = new FileDialog(fm, "파일 위치 선택",FileDialog.LOAD);
				sw.setDirectory(System.getProperty("user.home"));sw.setIconImage(ig);
				sw.setVisible(true);
				try {
					String qw;
					if(sw.getDirectory()==null) return;
					qw=IO.in(sw.getDirectory()+"\\"+sw.getFile());
					show1.setText("분석중입니다.");
					show1.setForeground(Color.orange);
					JSONObject qr=null;
					try{
						qr=(JSONObject) jps.parse(qw);
						if(DPT(qw)) {
							JSONObject of=(JSONObject) qr.get("Data");
							JSONArray ar = (JSONArray)of.get("DataBase");
							for(int i=0;i<ar.size();i++) {
								String qws=(String)ar.get(i);
								lT++;
								if(lT==td.length) {lT=0;}
								db.add(new meta(lT,td[lT]+1,qws));
								add(lT,qws);td[lT]++;
							}
							add.setEnabled(true);memory.setEnabled(true);del.setEnabled(true);sa.setEnabled(true);sarc.setEnabled(true);
							ld.setEnabled(true);rs.setEnabled(true);
							show1.setText("로드되었습니다.");
							show1.setForeground(Color.green);
						} else throw new Exception();
					} catch(Exception e2) {	
						int qwx=JOptionPane.showConfirmDialog(fm,"파일이 올바른 JSON 데이터파일이 아닙니다.\n대신 엔터로 구분하여 이름을 불러올까요?","JSON-Parse Exception",JOptionPane.YES_NO_OPTION);
						if(qwx==JOptionPane.YES_OPTION) {
							shortenCD(qw);
							return;
						} else {
							show1.setText("로드하지 않았습니다.");
							show1.setForeground(Color.red);
							add.setEnabled(true);memory.setEnabled(true);del.setEnabled(true);sa.setEnabled(true);sarc.setEnabled(true);
							ld.setEnabled(true);rs.setEnabled(true);
							return;
						}
					}
					for(int i=0;i<qw.length();i++) {
						if(qw.charAt(i)=='\n') {
							String qvm[]={"JSON 구문을 분석해 입력합니다.","엔터를 기준으로 나누어 입력합니다.","취소"};
							int qe=JOptionPane.showOptionDialog(fm, "파일이 올바른 JSON 구문인 듯 하지만 줄바꿈(엔터)가 있습니다.\n이를 줄바꿈을 기준으로 이름이 나뉘어져 있는 데이터로 로드할까요?", "JSON-E1", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, qvm, 0);
							if(qe==2) return;
							else if(qe==0) {
								show1.setText("로드중");
								show1.setForeground(Color.orange);
								JSONArray pwq=(JSONArray)qr.get("DataBase");
								add.setEnabled(false);memory.setEnabled(false);del.setEnabled(false);sa.setEnabled(false);sarc.setEnabled(false);
								ld.setEnabled(false);rs.setEnabled(false);
								int q=pwq.size();
								for(int ia=0;ia<q;ia++) {
									lT++;
									if(lT==td.length) {lT=0;}
									db.add(new meta(lT,td[lT]+1,(String)pwq.get(ia)));
									add(lT,(String)pwq.get(ia));td[lT]++;
								}
								add.setEnabled(true);memory.setEnabled(true);del.setEnabled(true);sa.setEnabled(true);sarc.setEnabled(true);
								ld.setEnabled(true);rs.setEnabled(true);
								show1.setText("로드되었습니다.");
								show1.setForeground(Color.green);
								break;
							} else if(qe==1) {
								shortenCD(qw);
								break;
							}
						}
					}
				} catch (Exception e1) {
					dialog(fm,e1);
					show1.setText("로드할 수 없습니다.\n기술 코드 : \n"+Except.except(e1));
					show1.setForeground(Color.red);
				}
				
			}
		}
		private void shortenCD(String cd) {
			int ltld=0;
			for(int i=0;i<cd.length();i++) {
				if(cd.charAt(i)=='\n') {
					String par=cd.substring(ltld,i-1);
					ltld=i+1;
					lT++;
					if(lT==td.length) {lT=0;}
					db.add(new meta(lT,td[lT]+1,par));
					add(lT,par);td[lT]++;
				}
			}
			add.setEnabled(true);memory.setEnabled(true);del.setEnabled(true);sa.setEnabled(true);sarc.setEnabled(true);
			ld.setEnabled(true);rs.setEnabled(true);
			show1.setText("로드되었습니다.");
			show1.setForeground(Color.green);
		}
		private class cls implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				show1.setText("준비중");show1.setForeground(Color.orange);
				int q=JOptionPane.showConfirmDialog(c, "모든 테이블의 모든 요소를 삭제합니다. 계속 합니까?","초기화",JOptionPane.YES_NO_OPTION);
				if(q==JOptionPane.YES_OPTION) {
					show1.setText("초기화 중");show1.setForeground(Color.red);
					for(int j=0;j<td.length;j++) td[j]=0;
					UIReset();
					lT=sp.length-1;db.clear();dbL.clear();
					show1.setText("모두 삭제되었습니다.");show1.setForeground(Color.green);
				}
			}
		}
		private class dec implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				show1.setText("검색중");show1.setForeground(Color.orange);
				String pos=memory.getText();
				int Tq=-1, cdx=-1;
				for(int i=0;i<pos.length();i++) {
					if(pos.charAt(i)==';') {
						Tq=Integer.parseInt(pos.substring(0,i));
						cdx=Integer.parseInt(pos.substring(i+1,pos.length()));
					}
				}
				if(Tq==-1 || cdx==-1) {
					show1.setText("위치 식별자 파싱에 실패했습니다.");show1.setForeground(Color.red);
				}
				int adr=(Tq-1)+sp.length*(cdx-1);
				try {
					meta c = db.elementAt(adr);
					if(Tq-1!=c.TableAddr||cdx!=c.serial) {
						show1.setText("주소 계산 공식과 원소 속성이 다릅니다. (T="+(Tq-1)+","+c.TableAddr+"),(ADR="+cdx+","+c.serial+")");show1.setForeground(Color.red);
						return;
					}
				} catch(ArrayIndexOutOfBoundsException e1) {
					show1.setText("존재하지 않는 위치입니다. (ADDRESS="+adr+")");show1.setForeground(Color.red);
					return;
				}
				memory.setText("");
				int n=JOptionPane.showConfirmDialog(null, "정말로 삭제합니까?","삭제 확인",JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION) {
					show1.setText("삭제 & 재정렬");show1.setForeground(Color.green);
					UIReset();
					db.remove(adr);
					dbL.remove(adr);
					lT=sp.length-1;String back[] = new String[db.size()];
					for(int j=0;j<td.length;j++) td[j]=0;
					for(int j=0;j<db.size();j++) {
						back[j]=db.elementAt(j).data;
					}
					db.clear();int lq=dbL.size();dbL.clear();
					for(int j=0;lq>j;j++) {
						lT++;
						if(lT==sp.length) {
							lT=0;
						}
						add(lT,back[j]);
						db.add(new meta(lT,td[lT]+1,back[j]));td[lT]++;
					}
					for(int i=0;i<sp.length;i++) {sp[i].repaint();c.repaint();}
				} else return;
			}
		}
		private void UIReset() {
			for(int i=0;i<db.size();i++) {
				sp[db.elementAt(i).TableAddr].remove(dbL.elementAt(i));
				sp[db.elementAt(i).TableAddr].setPreferredSize(new Dimension(280,0));
			}
			for(int i=0;i<sp.length;i++) {sp[i].setSize(300,0);sp[i].repaint();}
		}
		private int td[];
		private int lT;
		private void add(int tb, String data) {
			JLabel q = new JLabel((td[tb]+1)+". "+data);//q.setBorder(bord);
			sp[tb].setSize(300,(td[tb]+1)*46);q.setFont(std);q.setSize(300,46);q.setLocation(0,(td[tb])*46);sp[tb].add(q);sp[tb].repaint();
			sp[tb].setPreferredSize(new Dimension(280,46*(td[tb]+2)));
			dbL.add(q);
		}
		private class adb implements ActionListener {
			public adb() {
				td=new int[sp.length];
				lT=td.length-1;for(int i=0;i<td.length;i++) td[i]=0;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				if(memory.getText().equals("")) {show1.setText("이름을 입력해야 추가할 수 있습니다.");show1.setForeground(Color.red);}
				lT++;
				if(lT==td.length) {lT=0;}
				db.add(new meta(lT,td[lT]+1,memory.getText()));
				add(lT,memory.getText());td[lT]++;memory.setText("");
				show1.setText((lT+1)+"번 테이블 "+td[lT]+"번에 이름이 추가되었습니다.");show1.setForeground(Color.green);
			}
		}
		private class src implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				show1.setText("검색중......");show1.setForeground(Color.orange);
				if(db.size()==0) {
					show1.setText("등록되지 않은 이름입니다.");show1.setForeground(Color.green);
				} else {
					String cache=memory.getText();
					StringBuffer tos = new StringBuffer();
					int vnt=0;
					for(int i=0;i<db.size();i++) {
						if(db.elementAt(i).data.equals(cache)) {
							meta q=db.elementAt(i);
							tos.append(q.TableAddr+1+"번 테이블의 "+q.serial+"번 ");vnt++;
						}
					}
					if(vnt==0) {
						show1.setText("등록되지 않은 이름입니다.");show1.setForeground(Color.green);
					} else {
						tos.append("총 "+vnt+"번 겹칩니다.");
						show1.setText(tos.toString());show1.setForeground(Color.red);
					}
				}
			}
		}
	}
	@SuppressWarnings("unchecked")
	private static boolean DPT(String data) throws Exception {
		JSONObject root=(JSONObject)jps.parse(data);
		JSONObject dat=(JSONObject)root.get("Data");
		String sign=(String)root.get("Sign"),fp=(String)root.get("FingerPrint"),ts=(String)dat.get("TimeStamp");
		double v=(double)dat.get("MakeVers");
		if(v>VERSION_CODE) {
			JOptionPane.showMessageDialog(p,"이 버전에서는 본 파일을 열 수 없습니다.\n프로그램을 최신으로 업데이트하세요.","버전 충돌",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		JSONObject datx=new JSONObject();
		datx.put("MakeVers", v);datx.put("TimeStamp", ts);
		if(!AES256.decryptAES256(sign, hash.hash((String)dat.get("Name"), Hash.SHA384)).equals(new String(datx.toJSONString().getBytes(),"UTF-8"))) {
			JOptionPane.showMessageDialog(c, "파일을 열  수 없습니다.\n\n기술 정보 : data enc test failure","열지 못함",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if(!hash.hash(dat.toJSONString(),Hash.SHA512).equals(fp)) {
			JOptionPane.showMessageDialog(c, "파일을 열  수 없습니다.\n\n기술 정보 : data SHA Hash test failure","열지 못함",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
	}
	private static void dialog(Component parent, Exception e) {
		StackTraceElement[] p=e.getStackTrace();
		StringBuffer s = new StringBuffer("Exception : "+e.getMessage()+"\n");
		for(StackTraceElement q : p) {
			s.append("\tat"+q.getFileName()+"\\"+q.getClassName()+"."+q.getMethodName()+" LN="+q.getLineNumber()+"\n");
		}
		JOptionPane.showMessageDialog(parent,s.toString(), "ERR-"+e.getMessage(),JOptionPane.ERROR_MESSAGE);
	}
}